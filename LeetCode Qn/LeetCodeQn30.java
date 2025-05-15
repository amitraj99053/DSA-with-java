public class LeetCodeQn30 {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        if (s.equals(goal)) {
            return true;
        }

        for (int i = 0; i < s.length(); i++) {
            s = s.substring(1) + s.charAt(0);
            if (s.equals(goal)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        LeetCodeQn30 solution = new LeetCodeQn30(); 

        // EG 1
        String s1 = "abcde";
        String goal1 = "cdeab";
        boolean result1 = solution.rotateString(s1, goal1);
        System.out.println("Input: "+ s1 +" "+   goal1);
        System.out.println("Output: " + result1); // output: true

        // EG 2
        String s2 = "abcde";
        String goal2 = "abced";
        boolean result2 = solution.rotateString(s2, goal2);
        System.out.println("Input: "+ s2 +" "+   goal2);
        System.out.println("Output: " + result2); // output: false
    }
}