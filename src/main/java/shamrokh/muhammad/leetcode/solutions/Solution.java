package shamrokh.muhammad.leetcode.solutions;

class Solution {
    public int reverse(int x) {
        int reversed = 0;

        // Loop through each digit of the integer
        while (x != 0) {
            int currentDigit = x % 10;  // Extract the last digit
            x /= 10;           // Remove the last digit from x

            // Check if the reversed integer is going to overflow
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && currentDigit > 7)) {
                return 0;  // Overflow for positive number
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && currentDigit < -8)) {
                return 0;  // Overflow for negative number
            }

            // Add the digit to the reversed number
            reversed = reversed * 10 + currentDigit;
        }

        return reversed;
    }
}