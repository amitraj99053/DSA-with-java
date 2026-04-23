class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry; 
            
            if (i >= 0) {
                sum += a.charAt(i) - '0'; // Convert char to int
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0'; // Convert char to int
                j--;
            }
            
            result.append(sum % 2); // Result bit is sum modulo 2
            carry = sum / 2;        // Carry is sum divided by 2
        }
        
        return result.reverse().toString(); // Reverse because we added bits from right to left
    }
}
