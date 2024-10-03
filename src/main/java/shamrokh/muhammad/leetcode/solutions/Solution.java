package shamrokh.muhammad.leetcode.solutions;

import java.util.*;


public class Solution {
    private final String[] DIGITS_LETTERS = new String[]{
            "", // 0
            "", // 1
            "abc", // 2
            "def", // 3
            "ghi", // 4
            "jkl", // 5
            "mno", // 6
            "pqrs",// 7
            "tuv", // 8
            "wxyz" // 9
    };

    public List<String> letterCombinations(String digits) {
        // edge case: empty input
        if(digits == null || digits.isEmpty())
            return new ArrayList<>();

        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        // recursive function to build all combinations
        buildCombinations(result, sb, digits, 0);

        return result;
    }

    private void buildCombinations(List<String> result, StringBuilder sb, String digits, int currentIndex) {
        if(currentIndex == digits.length()){
            result.add(sb.toString());
            return;
        }

        // extracting the current digit letters.
        String numberCharacters = DIGITS_LETTERS[digits.charAt(currentIndex) - '0'];

        // iterating over letters to build combinations
        for(char c:numberCharacters.toCharArray()){
            sb.append(c);
            // recursively combine with next digit letters.
            buildCombinations(result,sb,digits,currentIndex+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}


