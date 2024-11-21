package shamrokh.muhammad.leetcode.solutions;

class Solution {
    public void nextPermutation(int[] nums) {
        //edge case
        if(nums.length == 1){
            return;
        }

        // finding first element from end that ruin the asc order
        int nonAscOrderElemIndex = -1;

        for(int i=nums.length-2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                nonAscOrderElemIndex = i;
                break;
            }
        }

        // all elements in nums are in desc order (we return to the smallest permutation)
        if(nonAscOrderElemIndex == -1){
            swapArray(nums, 0, nums.length -1);
            return;
        }

        // not all elements in nums are in desc order
        // finding first element from the end that is bigger than the non asc order element
        for(int i=nums.length -1;i>=nonAscOrderElemIndex;i--) {
            if(nums[i]>nums[nonAscOrderElemIndex]){
                swap(nums, i, nonAscOrderElemIndex);
                break;
            }
        }

        //swapping the asc order part
        swapArray(nums, nonAscOrderElemIndex +1, nums.length - 1);
    }

    private void swapArray(int[] nums, int start, int end) {

        while(start < end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }

    private void swap(int[] nums, int i1, int i2) {
        int tmp = nums[i1];
        nums[i1]=nums[i2];
        nums[i2]=tmp;
    }
}



