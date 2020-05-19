import java.util.*;
public class selectionSortExample {
    static void selectionSort(final int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index=i;
            for (int j = i; j < arr.length; j++) {
                if(arr[j]<arr[index]){
                    index=j;
                }
            }
        int smallerNumber =arr[index];
        arr[index]=arr[i];
        arr[i]=smallerNumber;
        }
        
    }

    public static void main(final String[] args) {
         Scanner sc = new Scanner(System.in);
         int arr[] = new int[5];
        for (int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Before sorting the array is: ");
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        selectionSort(arr);
        System.out.println("\nAfter sorting the array is: ");
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}