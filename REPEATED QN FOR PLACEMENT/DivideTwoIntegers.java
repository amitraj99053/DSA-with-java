class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        boolean isNegative = (dividend < 0) ^ (divisor < 0);

        long lDividend = Math.abs((long) dividend);
        long lDivisor = Math.abs((long) divisor);

        int quotient = 0;
        
        while (lDividend >= lDivisor) {
            long tempDivisor = lDivisor;
            int numShifts = 0;
            
            while (lDividend >= (tempDivisor << 1)) {
                tempDivisor <<= 1;
                numShifts++;
            }
            
            lDividend -= tempDivisor;
            quotient += (1 << numShifts);
        }

        return isNegative ? -quotient : quotient;
    }
}
