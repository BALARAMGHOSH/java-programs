import java.util.*;


public class binarySearch {
    public static void main(final String[] args) {
        int n, array[], first, last, middle, item;
        final Scanner input = new Scanner(System.in);
        System.out.println("enter size of array: ");
        n=input.nextInt();
        array=new int[n];
        System.out.println("enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            array[i]=input.nextInt();
        }
    
        System.out.println("enter the value to be searched: ");
        item=input.nextInt();
        first=0;
        last=n-1;
        middle=(first+last)/2;
        
        while (first<=last) {
            if (array[middle]<item) {
                first =middle+1;
            }
            else if(array[middle]==item) {
                System.out.println("the location of the value is "+(middle+1));
                break;
            }
            else{
                last=middle-1;
            }
            middle=(first+last)/2;
        }
        if (first>last) {
            System.out.println("item not fountd.");
        }
    }
}