class MajorEle {
    public static void main(String[] args) {
       
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        
        Solution obj = new Solution();
        int result = obj.majorityElement(nums);
        
        System.out.println("The majority element is: " + result);
    }
}

class Solution {
    public int majorityElement(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int c = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    c++;
                }
            }
            if (c > nums.length / 2) {
                return nums[i];
            }
        }
        return -1;
    }
}
