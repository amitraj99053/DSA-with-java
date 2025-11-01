import java.util.*;

public class SolveTheExpression {

    private static final Map<String, String> SYMBOL_MAP = new HashMap<>();
    private static int BINARY_LENGTH = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] digitPatterns = new String[3];
        for (int i = 0; i < 3; i++) digitPatterns[i] = scanner.nextLine();
        for (int i = 0; i < 10; i++) {
            String pattern = parsePattern(digitPatterns, i * 3);
            SYMBOL_MAP.put(pattern, String.valueOf(i));
        }

        String[] opPatterns = new String[3];
        for (int i = 0; i < 3; i++) opPatterns[i] = scanner.nextLine();
        String[] opSymbols = {"||", "&&", "~", "(", ")"};
        for (int i = 0; i < 5; i++) {
            String pattern = parsePattern(opPatterns, i * 3);
            SYMBOL_MAP.put(pattern, opSymbols[i]);
        }

        String[] expressionPatterns = new String[3];
        for (int i = 0; i < 3; i++) expressionPatterns[i] = scanner.nextLine();
        scanner.close();

        List<String> tokens = new ArrayList<>();
        List<String> rawNumbers = new ArrayList<>();
        int maxRawLength = 0;

        int totalWidth = expressionPatterns[0].length();
        StringBuilder currentNumber = new StringBuilder();

        for (int col = 0; col < totalWidth; col += 3) {
            String pattern = parsePattern(expressionPatterns, col);
            String symbol = SYMBOL_MAP.get(pattern);

            if (symbol.length() == 1 && Character.isDigit(symbol.charAt(0))) {
                currentNumber.append(symbol);
            } else {
                if (currentNumber.length() > 0) {
                    String num = currentNumber.toString();
                    tokens.add(num);
                    rawNumbers.add(num);
                    maxRawLength = Math.max(maxRawLength, num.length() * 9);
                    currentNumber = new StringBuilder();
                }
                tokens.add(symbol);
            }
        }
        if (currentNumber.length() > 0) {
            String num = currentNumber.toString();
            tokens.add(num);
            rawNumbers.add(num);
            maxRawLength = Math.max(maxRawLength, num.length() * 9);
        }
        
        BINARY_LENGTH = maxRawLength;

        Map<String, String> binaryMap = new HashMap<>();
        for(String num : rawNumbers) {
            if (!binaryMap.containsKey(num)) {
                binaryMap.put(num, getPaddedBinary(num, expressionPatterns));
            }
        }

        List<String> rpn = toRpn(tokens, binaryMap);

        String resultBinary = evaluateRpn(rpn);

        System.out.println(binaryToDecimal(resultBinary));
    }

    private static String parsePattern(String[] patterns, int startCol) {
        StringBuilder binary = new StringBuilder();
        for (int r = 0; r < 3; r++) {
            String row = patterns[r];
            for (int c = startCol; c < startCol + 3 && c < row.length(); c++) {
                char segment = row.charAt(c);
                if (segment != ' ') {
                    binary.append('1');
                } else {
                    binary.append('0');
                }
            }
        }
        while(binary.length() < 9) {
            binary.append('0');
        }
        return binary.substring(0, 9);
    }

    private static String getPaddedBinary(String number, String[] expressionPatterns) {
        StringBuilder concatenatedBinary = new StringBuilder();
        for (char digit : number.toCharArray()) {
            String digitPattern = null;
            for (Map.Entry<String, String> entry : SYMBOL_MAP.entrySet()) {
                if (entry.getValue().equals(String.valueOf(digit))) {
                    digitPattern = entry.getKey();
                    break;
                }
            }
            if (digitPattern != null) {
                concatenatedBinary.append(digitPattern);
            }
        }

        StringBuilder paddedBinary = new StringBuilder();
        int padding = BINARY_LENGTH - concatenatedBinary.length();
        for(int i = 0; i < padding; i++) {
            paddedBinary.append('0');
        }
        paddedBinary.append(concatenatedBinary);
        return paddedBinary.toString();
    }

    private static long binaryToDecimal(String binary) {
        long decimalValue = 0;
        long powerOf2 = 1;
        
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimalValue += powerOf2;
            }
            powerOf2 *= 2;
        }
        return decimalValue;
    }

    private static int precedence(String op) {
        if (op.equals("~")) return 3;
        if (op.equals("&&")) return 2;
        if (op.equals("||")) return 1;
        return 0;
    }

    private static List<String> toRpn(List<String> tokens, Map<String, String> binaryMap) {
        List<String> rpn = new ArrayList<>();
        Stack<String> operatorStack = new Stack<>();

        for (String token : tokens) {
            if (precedence(token) == 0 && !token.equals("(") && !token.equals(")")) {
                rpn.add(binaryMap.getOrDefault(token, token));
            } else if (token.equals("(")) {
                operatorStack.push(token);
            } else if (token.equals(")")) {
                while (!operatorStack.isEmpty() && !operatorStack.peek().equals("(")) {
                    rpn.add(operatorStack.pop());
                }
                if (!operatorStack.isEmpty() && operatorStack.peek().equals("(")) {
                    operatorStack.pop();
                }
            } else {
                while (!operatorStack.isEmpty() && precedence(operatorStack.peek()) >= precedence(token)) {
                    rpn.add(operatorStack.pop());
                }
                operatorStack.push(token);
            }
        }

        while (!operatorStack.isEmpty()) {
            rpn.add(operatorStack.pop());
        }
        return rpn;
    }

    private static String evaluateRpn(List<String> rpn) {
        Stack<String> operandStack = new Stack<>();

        for (String token : rpn) {
            if (precedence(token) == 0) {
                operandStack.push(token);
            } else {
                if (token.equals("~")) {
                    String a = operandStack.pop();
                    operandStack.push(bitwiseNot(a));
                } else {
                    String b = operandStack.pop();
                    String a = operandStack.pop();
                    if (token.equals("&&")) {
                        operandStack.push(bitwiseAnd(a, b));
                    } else if (token.equals("||")) {
                        operandStack.push(bitwiseOr(a, b));
                    }
                }
            }
        }
        return operandStack.pop();
    }

    private static String bitwiseAnd(String a, String b) {
        StringBuilder result = new StringBuilder(a.length());
        for (int i = 0; i < a.length(); i++) {
            result.append((a.charAt(i) == '1' && b.charAt(i) == '1') ? '1' : '0');
        }
        return result.toString();
    }

    private static String bitwiseOr(String a, String b) {
        StringBuilder result = new StringBuilder(a.length());
        for (int i = 0; i < a.length(); i++) {
            result.append((a.charAt(i) == '1' || b.charAt(i) == '1') ? '1' : '0');
        }
        return result.toString();
    }

    private static String bitwiseNot(String a) {
        StringBuilder result = new StringBuilder(a.length());
        for (int i = 0; i < a.length(); i++) {
            result.append((a.charAt(i) == '1') ? '0' : '1');
        }
        return result.toString();
    }
}