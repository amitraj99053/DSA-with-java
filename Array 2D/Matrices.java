import java.util.*;

public class Matrices {
    public static boolean search(int matrix[][], int key) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("found at cell ("+ i +"," + j +")");
                    return true;
                }
            }
        }
        System.out.println("Not found: ");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;
        // n = row
        // m = columns

        Scanner in = new Scanner(System.in);
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        System.out.println("---- Matrix of 3X3 ----");
        // output
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix, 5);

        in.close();
    }
}