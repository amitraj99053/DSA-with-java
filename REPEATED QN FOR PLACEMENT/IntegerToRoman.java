import java.util.Scanner;

public class IntegerToRoman {
    
    public static String intToRoman(int num) {
        
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder roman = new StringBuilder();
        
        for (int i = 0; i < values.length && num > 0; i++) {
            
            while (num >= values[i]) {
                num -= values[i];           
                roman.append(symbols[i]);   
            }
        }
        
        return roman.toString();
    }
    

    public static void printResult(int num, String roman) {
        System.out.println(num + " -> " + roman);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("=== Integer to Roman Numeral Converter ===\n");
        
        System.out.println("Test Case 1:");
        int test1 = 1994;
        String result1 = intToRoman(test1);
        printResult(test1, result1);
        System.out.println("Expected: MCMXCIV\n");
        
        System.out.println("Test Case 2:");
        int test2 = 9;
        String result2 = intToRoman(test2);
        printResult(test2, result2);
        System.out.println("Expected: IX\n");
        
        System.out.println("Test Case 3:");
        int test3 = 58;
        String result3 = intToRoman(test3);
        printResult(test3, result3);
        System.out.println("Expected: LVIII\n");
        
        System.out.println("Test Case 4:");
        int test4 = 1;
        String result4 = intToRoman(test4);
        printResult(test4, result4);
        System.out.println("Expected: I\n");
        
        System.out.println("Test Case 5:");
        int test5 = 3999;
        String result5 = intToRoman(test5);
        printResult(test5, result5);
        System.out.println("Expected: MMMCMXCIX\n");
        
        System.out.println("Test Case 6:");
        int test6 = 100;
        String result6 = intToRoman(test6);
        printResult(test6, result6);
        System.out.println("Expected: C\n");
        
        System.out.println("Test Case 7:");
        int test7 = 1444;
        String result7 = intToRoman(test7);
        printResult(test7, result7);
        System.out.println("Expected: MCDXLIV\n");
        
        
        System.out.println("=== Interactive Mode ===");
        System.out.println("Enter an integer (1-3999) to convert to Roman numeral");
        System.out.println("(or enter 0 to exit):\n");
        
        int userInput;
        while (true) {
            System.out.print("Enter number: ");
            
            if (!in.hasNextInt()) {
                System.out.println("Invalid input! Please enter an integer.");
                in.nextLine(); // Clear invalid input
                continue;
            }
            
            userInput = in.nextInt();
            
            if (userInput == 0) {
                System.out.println("Exiting...");
                break;
            }
            
            if (userInput < 1 || userInput > 3999) {
                System.out.println("Invalid range! Please enter a number between 1 and 3999.");
                continue;
            }
            
            String result = intToRoman(userInput);
            printResult(userInput, result);
            System.out.println();
        }
        
        in.close();
    }
}
