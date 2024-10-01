package shamrokh.muhammad.leetcode.solutions;

class Solution {
    public int myAtoi(String s) {
        int currentChar = 0;
        int result = 0;
        int sign = 1;

        // step1: removing any leading zeros
        s = s.trim();

        //edge case: empty string
        if(s.isEmpty())
            return 0;

        // step2: Signedness
        // the number starts with a character (we return 0)
        if(Character.isAlphabetic(s.charAt(0)) || s.charAt(0)=='.'){
            return 0;
        }

        if(s.charAt(0) == '-'){
            sign = -1;
            currentChar++;
        }
        else if(s.charAt(0) == '+')
            currentChar++;

        // step3: reading the number
        while(currentChar < s.length() && Character.isDigit(s.charAt(currentChar))){
            int digit = s.charAt(currentChar) - '0';

            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return Integer.MAX_VALUE;  // Overflow for positive number
            }
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && digit*sign < 8)) {
                return Integer.MIN_VALUE;  // Overflow for negative number
            }
            result = result*10 + digit*sign;
            currentChar++;
        }

        return result;
    }
}