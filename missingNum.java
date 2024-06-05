import java.util.Scanner;

public class missingNum {
    public int missingNumber(int[] nums) {
        int s = 0;
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        for(int i = 0; i < nums.length; i++){
            s += nums[i];
        }
        return sum - s;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter length of array:");
        int n = sc.nextInt();
        
        int[] nums = new int[n];
        
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        missingNum m = new missingNum();
        int missingNumber = m.missingNumber(nums);

        System.out.println("Missing number is: " + missingNumber);

        sc.close();
    }
}
