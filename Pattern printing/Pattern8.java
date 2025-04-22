import java.util.Scanner;
/*
number half pyramid
Enter no: 5
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15  
*/
public class Pattern8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no: ");
        int n = in.nextInt();
        int num=1;

        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
        in.close();
    }
}
