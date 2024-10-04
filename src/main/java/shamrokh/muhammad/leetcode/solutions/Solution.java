package shamrokh.muhammad.leetcode.solutions;

import java.util.*;


public class Solution {
    StringBuilder sb=new StringBuilder();
    List<String> result=new ArrayList<>();
    int length=0;

    public List<String> generateParenthesis(int n) {
        length=n;

        generateParenthesis(0,0);
        return result;
    }

    private void generateParenthesis(int open,int close){

        if(sb.length()==length*2) {
            result.add(sb.toString());
        }

        if(open<length){
            sb.append("(");
            generateParenthesis(open+1,close);
            sb.deleteCharAt(sb.length()-1);
        }

        if(close<open){
            sb.append(")");
            generateParenthesis(open,close+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}


