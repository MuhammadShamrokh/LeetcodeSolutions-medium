package shamrokh.muhammad.leetcode.solutions;

class Solution {
    public String longestPalindrome(String s) {
        int[] substringResultIndex = new int[2];
        int longestPalindromeLength = 0;

        for(int i=0;i<s.length();i++){
            int left = i;
            int right = i;
            // odd palindrome substring length
            longestPalindromeLength = checkLongestPalindromeLength(left, right, s, substringResultIndex, longestPalindromeLength);

            //even palindrome substring length
            right = i+1;
            longestPalindromeLength = checkLongestPalindromeLength(left, right, s, substringResultIndex, longestPalindromeLength);
        }

        return s.substring(substringResultIndex[0], substringResultIndex[1] + 1);
    }

    private int checkLongestPalindromeLength(int left, int right, String s, int[] palindromeIndexes, int currentLongestLength){
        int stringLength = s.length();

        while(left >=0 && right <stringLength && s.charAt(left)==s.charAt(right)){
            if(right - left > currentLongestLength){
                palindromeIndexes[0] = left;
                palindromeIndexes[1] = right;
                currentLongestLength = right-left;
            }

            left --;
            right ++;
        }

        return currentLongestLength;
    }
}
