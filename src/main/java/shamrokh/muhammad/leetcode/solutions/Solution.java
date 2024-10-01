package shamrokh.muhammad.leetcode.solutions;


class Solution {
    public String convert(String s, int numRows) {
        //edge case, number of rows is 1
        if(numRows == 1)
            return s;

        StringBuilder[] strings = new StringBuilder[numRows];
        int currentDirection = 1;
        int scanner = 0;
        int currentIndex = 0;

        // initialing all lines string builders
        for(int i=0;i< numRows;i++){
            strings[i] = new StringBuilder();
        }

        // scanning the string to apply zigzag conversion
        while(currentIndex < s.length()){
            // placing current index in the current line.
            strings[scanner].append(s.charAt(currentIndex));

            // moving to the next line
            scanner += currentDirection;
            // we reached the last line, we switch to backward moving direction
            if(scanner == numRows-1)
                currentDirection = -1;
            // we reached the first line, we switch to forward moving direction
            if(scanner == 0)
                currentDirection = 1;

            // update current scanning string index
            currentIndex++;
        }

        // assembling the result string in strings[0]
        for(int i=1;i<numRows;i++){
            strings[0].append(strings[i].toString());
        }

        return strings[0].toString();
    }
}
