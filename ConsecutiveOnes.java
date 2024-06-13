import java.util.Scanner;

public class ConsecutiveOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int size = sc.nextInt();
        int[] nums = new int[size];

        System.out.println("Enter the elements of array only 0's and 1's");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        
        // Create an instance of the inner Solution class
        Solution solution = new ConsecutiveOnes().new Solution();
        int res = solution.findMaxConsecutiveOnes(nums);
        System.out.println("Maximum number of 1's = " + res);
        
        // Close the scanner
        sc.close();
    }

    class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int maxCount = 0;
            int currentCount = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 1) {
                    currentCount++;
                    maxCount = Math.max(currentCount, maxCount);
                } else {
                    currentCount = 0;
                }
            }
            return maxCount;
        }
    }
}
