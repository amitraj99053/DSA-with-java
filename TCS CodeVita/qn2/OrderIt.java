import java.util.*;

public class OrderIt {

    private static final Map<String, Integer> FACE_MAP = Map.of(
        "base", 0, "back", 1, "top", 2, "front", 3, "left", 4, "right", 5
    );

    private static String finalOutput = "Not Possible";

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            if (!scanner.hasNextInt()) return;
            int N = scanner.nextInt();
            int K = scanner.nextInt();
            scanner.nextLine();

            char[][][] initialFaces = readInitialFaces(scanner, N);
            String[] instructions = readInstructions(scanner, K);

            if (findSolution(initialFaces, instructions, N, K, false)) {
                System.out.println(finalOutput);
                return;
            }

            Cube correctedCube = findAndCorrectFault(initialFaces, N);
            if (correctedCube != null) {
                if (findSolution(correctedCube.faces, instructions, N, K, true)) {
                    System.out.println(finalOutput);
                    return;
                }
            }

            System.out.println("Not Possible");
        }
    }

    private static char[][][] readInitialFaces(Scanner scanner, int N) {
        char[][][] faces = new char[6][N][N];
        for (int f = 0; f < 6; f++) {
            for (int r = 0; r < N; r++) {
                String line = scanner.nextLine();
                String[] parts = line.split(" ");
                for (int c = 0; c < N; c++) {
                    faces[f][r][c] = parts[c].charAt(0);
                }
            }
        }
        return faces;
    }

    private static String[] readInstructions(Scanner scanner, int K) {
        String[] instructions = new String[K];
        for (int i = 0; i < K; i++) {
            instructions[i] = scanner.nextLine();
        }
        return instructions;
    }

    private static Cube findAndCorrectFault(char[][][] initialFaces, int N) {
        Map<Character, Integer> counts = new HashMap<>();
        int N2 = N * N;

        for (int f = 0; f < 6; f++) {
            for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) {
                    counts.put(initialFaces[f][r][c], counts.getOrDefault(initialFaces[f][r][c], 0) + 1);
                }
            }
        }

        Character cUnder = null;
        Character cOver = null;

        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == N2 - 1) cUnder = entry.getKey();
            if (entry.getValue() == N2 + 1) cOver = entry.getKey();
        }

        if (cUnder != null && cOver != null) {
            char[][][] correctedFaces = deepCopy(initialFaces, N);

            for (int f = 0; f < 6; f++) {
                for (int r = 0; r < N; r++) {
                    for (int c = 0; c < N; c++) {
                        if (correctedFaces[f][r][c] == cOver) {
                            correctedFaces[f][r][c] = cUnder;
                            return new Cube(correctedFaces, N);
                        }
                    }
                }
            }
        }
        return null;
    }

    private static boolean findSolution(char[][][] initialFaces, String[] instructions, int N, int K, boolean isFaulty) {
        for (int skipIndex = 0; skipIndex < K; skipIndex++) {
            Cube cube = new Cube(initialFaces, N);

            for (int i = 0; i < K; i++) {
                if (i != skipIndex) {
                    cube.executeInstruction(instructions[i]);
                }
            }

            for (int f = 0; f < 6; f++) {
                if (cube.isSolved(f)) {
                    if (isFaulty) {
                        finalOutput = "Faulty\n" + instructions[skipIndex];
                    } else {
                        finalOutput = instructions[skipIndex];
                    }
                    return true;
                }
            }
        }
        return false;
    }
    
    private static char[][][] deepCopy(char[][][] original, int N) {
        char[][][] copy = new char[6][N][N];
        for (int f = 0; f < 6; f++) {
            for (int r = 0; r < N; r++) {
                System.arraycopy(original[f][r], 0, copy[f][r], 0, N);
            }
        }
        return copy;
    }
}