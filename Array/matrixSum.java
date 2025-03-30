import java.util.Scanner;

public class matrixSum {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];
        int sum = 0;

        // Read the matrix elements and calculate the sum
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
                sum += matrix[i][j];
            }
        }

        // Print the sum
        System.out.println(sum);
    }
}
