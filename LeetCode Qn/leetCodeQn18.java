import java.util.Scanner;
// Qn14. Longest Common Prefix
public class leetCodeQn18 {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) {
            return "";
        }   

        String prefix = strs[0];
        for(int i = 1; i < strs.length; i++) {
            while(strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] strs = new String[n];

        for(int i = 0; i < n; i++) {
            strs[i] = in.next(); // read strings
        }

        leetCodeQn18 solution = new leetCodeQn18();
        String result = solution.longestCommonPrefix(strs);
        System.out.println(result);
        in.close();



    }
}
