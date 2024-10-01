package shamrokh.muhammad.leetcode.solutions;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        // edge case: empty or 1 character string
        if(s.isEmpty() || s.length() == 1)
            return s.length();

        Map<Character, Integer> lastSeenIndex = new HashMap<>();
        int leftIndex = 0;
        int rightIndex = 0;
        int longestSubstringLength = 0;

        while(rightIndex < s.length()){
            char currentChar = s.charAt(rightIndex);
            // we have seen the character before
            if(lastSeenIndex.containsKey(currentChar)) {
                // checking if the last appearance of the character is inside the sliding window
                if (lastSeenIndex.get(currentChar) >= leftIndex) {
                    // updating the left side of the sliding window
                    leftIndex = lastSeenIndex.get(currentChar) + 1;
                }
            }

            // updating the current char last seen index in map
            lastSeenIndex.put(currentChar, rightIndex);
            // updating the right side of the sliding window to continue scanning
            rightIndex++;
            // checking if we are facing a new longest substring
            longestSubstringLength = Math.max(longestSubstringLength, rightIndex-leftIndex);

        }

        return longestSubstringLength;
    }
}
