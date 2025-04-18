import java.util.Scanner;

public class LeetCodeQn22 {
    
    public int lengthOfLastWord(String s) {
        String trimmedString = s.trim();

        int lastSpaceIndex = trimmedString.lastIndexOf(' ');

        if (lastSpaceIndex == -1) {
            return trimmedString.length();
        } else {
            return trimmedString.length() - 1 - lastSpaceIndex;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        LeetCodeQn22 solution = new LeetCodeQn22();
        int lastWordLength = solution.lengthOfLastWord(inputString);

        System.out.println("The length of the last word is: " + lastWordLength);
        scanner.close();
    }
} 

