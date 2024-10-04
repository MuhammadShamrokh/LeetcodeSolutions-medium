package shamrokh.muhammad.leetcode.solutions;

import java.util.*;


public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        // if nums doesnt include 4 elements, we return empty result.
        if(nums == null || nums.length < 4){
            return new ArrayList<>();
        }

        // nums has 4 or more elements
        List<List<Integer>> result = new ArrayList<>();

        // sorting array for more efficient two sum (2 pointers) and duplicate skipping
        Arrays.sort(nums);

        for(int i=0;i<nums.length - 3;i++){
            // skip duplicates
            if(i>0 && nums[i-1] == nums[i])
                continue;

            for(int j=i+1;j<nums.length -2;j++){
                // skip duplicates
                if(j>i+1 && nums[j-1] == nums[j])
                    continue;

                int left = j+1;
                int right = nums.length -1;

                while(left < right){
                    long sum = (long)nums[i]+nums[j]+nums[left]+nums[right];

                    // we found 4 elements that their sum is equal to target
                    if(sum == target){
                        result.add(List.of(nums[i],nums[j],nums[left],nums[right]));

                        while(left<right && nums[left] == nums[left+1])
                            left++;

                        while(right > left && nums[right]== nums[right-1])
                            right--;

                        left++;
                        right--;
                    } else if(sum < target){
                        left++;
                    } else { // sum < target
                        right--;
                    }
                }
            }
        }

        return result;
    }

}


