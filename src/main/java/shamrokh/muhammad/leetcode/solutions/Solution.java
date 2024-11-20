package shamrokh.muhammad.leetcode.solutions;


class Solution {
    public int divide(int dividend, int divisor) {
        // Handle edge case for overflow
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Determine the sign of the result
        boolean isNegative = (dividend < 0) ^ (divisor < 0);

        // Work with absolute values
        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);

        int quotient = 0;

        // Subtract multiples of the divisor using bit shifting
        while (absDividend >= absDivisor) {
            long tempDivisor = absDivisor;
            int numShifts = 0;

            while (absDividend >= (tempDivisor << 1)) {
                tempDivisor <<= 1;
                numShifts++;
            }

            absDividend -= tempDivisor;
            quotient += (1 << numShifts);
        }

        // Apply the sign to the result
        return isNegative ? -quotient : quotient;
    }
}



