class DivideTwoIntegers {
    
    public int divide(int dividend, int divisor) {
        // Edge case: MIN_VALUE / -1 would overflow
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Determine sign of result using XOR
        boolean isNegative = (dividend < 0) ^ (divisor < 0);

        // Convert to long to handle absolute values safely
        long lDividend = Math.abs((long) dividend);
        long lDivisor = Math.abs((long) divisor);

        int quotient = 0;
        
        // Keep subtracting divisor from dividend using bit shifting
        while (lDividend >= lDivisor) {
            long tempDivisor = lDivisor;
            int numShifts = 0;
            
            // Find the largest multiple of divisor that fits into dividend
            while (lDividend >= (tempDivisor << 1)) {
                tempDivisor <<= 1;  
                numShifts++;
            }
            
            lDividend -= tempDivisor;
            quotient += (1 << numShifts);
        }

        return isNegative ? -quotient : quotient;
    }
    
    public static void main(String[] args) {
        DivideTwoIntegers solution = new DivideTwoIntegers();
        
        // Test case 1: Positive division
        System.out.println("Test 1: divide(10, 3)");
        System.out.println("Expected: 3");
        System.out.println("Result: " + solution.divide(10, 3));
        System.out.println();
        
        // Test case 2: Negative dividend
        System.out.println("Test 2: divide(7, -3)");
        System.out.println("Expected: -2");
        System.out.println("Result: " + solution.divide(7, -3));
        System.out.println();
        
        // Test case 3: Both negative
        System.out.println("Test 3: divide(-10, -3)");
        System.out.println("Expected: 3");
        System.out.println("Result: " + solution.divide(-10, -3));
        System.out.println();
        
        // Test case 4: Edge case - MIN_VALUE / -1 (overflow)
        System.out.println("Test 4: divide(Integer.MIN_VALUE, -1)");
        System.out.println("Expected: " + Integer.MAX_VALUE);
        System.out.println("Result: " + solution.divide(Integer.MIN_VALUE, -1));
        System.out.println();
        
        // Test case 5: Exact division
        System.out.println("Test 5: divide(15, 3)");
        System.out.println("Expected: 5");
        System.out.println("Result: " + solution.divide(15, 3));
        System.out.println();
        
        // Test case 6: Dividend smaller than divisor
        System.out.println("Test 6: divide(1, 2)");
        System.out.println("Expected: 0");
        System.out.println("Result: " + solution.divide(1, 2));
        System.out.println();
        
        // Test case 7: Large numbers
        System.out.println("Test 7: divide(1534236469, 1137959673)");
        System.out.println("Expected: 1");
        System.out.println("Result: " + solution.divide(1534236469, 1137959673));
        System.out.println();
        
        // Test case 8: MIN_VALUE division
        System.out.println("Test 8: divide(Integer.MIN_VALUE, 1)");
        System.out.println("Expected: " + Integer.MIN_VALUE);
        System.out.println("Result: " + solution.divide(Integer.MIN_VALUE, 1));
    }
}
