class singleNum{
    public int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int c = 0;  
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == n) {
                    c++;
                }
            }
            if (c == 1) {
                return nums[i];
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        singleNum s = new singleNum();
        
        int[] nums1 = {2, 2, 1};
        int[] nums2 = {4, 1, 2, 1, 2};
        int[] nums3 = {1};
        
        System.out.println("Single number in array 1: " + s.singleNumber(nums1)); 
        System.out.println("Single number in array 2: " + s.singleNumber(nums2)); 
        System.out.println("Single number in array 3: " + s.singleNumber(nums3)); 
    }
}
