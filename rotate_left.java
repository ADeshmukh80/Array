import java.util.Scanner;

public class rotate_left {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            t[(i + k) % n] = nums[i];
        }
        for (int i = 0; i < n; i++) {
            nums[i] = t[i];
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

        System.out.print("Enter the number of rotations: ");
        int k = sc.nextInt();

        rotate_left r = new rotate_left();
        r.rotate(nums, k);
        
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Rotated Array: "+nums[i] + " ");
        }
        sc.close();
    }
}
