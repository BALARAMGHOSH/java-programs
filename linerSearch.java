import java.util.Scanner;

public class linerSearch {
    public static void main(String[] args) {
        System.out.println("LINEAR SEARCH:-");
        int n,i,array[],value;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        n=sc.nextInt();
        System.out.println("Enter the "+n+" digit array:"); 
        array=new int[n];
        for(i=0;i<n;i++)
           array[i]=sc.nextInt();
        
        System.out.println("Enter the search value:");
        value=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(array[i]==value)
            {
                System.out.println("the search value is present in "+(i+1)+" postition");
                break;
            }
        }
        if(i==n)
            System.out.println(value+" does not exist.");
    }
}