import java.util.*;

public class bubbleSortExample {
    static void bubbleSort(final int[] arr) {
        final int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int arr[] = new int[5];
        for (int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Before sorting the array is: ");
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        bubbleSort(arr);
        System.out.println("\nAfter sorting the array is: ");
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}