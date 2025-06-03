import java.util.Scanner;

public class GreatestNoMatrices {
    public static void FindMaximumNum(int matrix[][]) {
        int max = Integer.MIN_VALUE;

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("Maximum number in the matrix is : " + max);
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;

        Scanner in = new Scanner(System.in);
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        // output
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        FindMaximumNum(matrix);

        in.close();
    }
}
