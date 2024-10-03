package shamrokh.muhammad.leetcode.solutions;

import java.util.Arrays;


public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        // Sort the array to use the two-pointer approach
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2]; // Initialize with the first possible sum

        // Iterate through the array
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            // Use two pointers to find the best sum for the current `nums[i]`
            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];

                // If this sum is closer to the target, update `closestSum`
                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }

                // Move the pointers to try and get closer to the target
                if (currentSum < target) {
                    left++;  // Increase the sum by moving the left pointer to the right
                } else if (currentSum > target) {
                    right--; // Decrease the sum by moving the right pointer to the left
                } else {
                    // If the current sum is exactly equal to the target, return it
                    return currentSum;
                }
            }
        }

        // Return the closest sum found
        return closestSum;
    }
}


