import java.util.Scanner;

class moveZerosToEnd {
    public void moveZeroes(int[] nums) {
        int i = 0;  
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            }
        }
        while (i < nums.length) {
            nums[i] = 0;    // Fill the remaining positions with zeroes

            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        moveZerosToEnd s = new moveZerosToEnd();
        s.moveZeroes(nums);

        System.out.println("After moving zeroes: ");
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]+" ");
        }
    
        sc.close();
    }
}
