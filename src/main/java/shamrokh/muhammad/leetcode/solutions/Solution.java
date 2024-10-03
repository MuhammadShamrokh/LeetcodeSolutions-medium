package shamrokh.muhammad.leetcode.solutions;
import java.util.*;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        // Step 1: Sort the array
        Arrays.sort(nums);

        // Step 2: Iterate through the array
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicates for the current element
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            // Step 3: Use two-pointer technique for finding the other two elements
            twoSum(nums, i, result);
        }


        return result;
    }

    private void twoSum(int[] nums, int i, List<List<Integer>> result){
        int left = i + 1;
        int right = nums.length - 1;
        int target = -nums[i];

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                // Skip duplicates for the second and third elements
                while (left < right && nums[left] == nums[left + 1]) left++;
                while (left < right && nums[right] == nums[right - 1]) right--;

                // Move both pointers
                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
    }
}
