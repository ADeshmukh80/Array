import java.util.Scanner;

public class remove_duplicates {
    static class Solution {
        public int removeDuplicates(int[] nums) {
            int i = 0;
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] != nums[j]) {
                    nums[i + 1] = nums[j];
                    i++;
                }
            }
            return (i + 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        Solution solution = new Solution();
        int newSize = solution.removeDuplicates(arr);
        
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}
