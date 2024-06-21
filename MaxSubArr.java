class MaxSubArr {
    public static void main(String[] args) {
        // Static input for testing
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        
        Solution obj = new Solution();
        int result = obj.maxSubArray(nums);
        
        System.out.println("The maximum subarray sum is: " + result);
    }
}

class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxi = Integer.MIN_VALUE; // Use Integer.MIN_VALUE for the smallest possible value
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i]; // Add the current element to sum
            maxi = Math.max(sum, maxi); // Update maxi if sum is greater
            if (sum < 0) {
                sum = 0; // Reset sum to 0 if it becomes negative
            }
        }
        return maxi; // Return the maximum subarray sum
    }
}
