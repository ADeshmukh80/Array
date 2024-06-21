import java.util.Scanner;
public class second_largest {
    static int largest(int arr[], int n) {
        int largest = arr[0];
        int sLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                sLargest = largest;
                largest = arr[i];
            } else if (arr[i] > sLargest && arr[i] != largest) {
                sLargest = arr[i];
            }
        }
        if (sLargest == Integer.MIN_VALUE) {
            return -1;
        }
        return sLargest;
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
        System.out.println("Second largest in given array is " + largest(arr, n));

        scanner.close();
    }
}