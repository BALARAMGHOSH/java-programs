import java.util.Scanner;

public class floydsTringle {
    public static void main(String[] args) {
        int n,number=1;
        System.out.println("Enter the number of the row:");
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        System.out.println("Floyd's triangle");
        System.out.println("****************");
        for(int i=0; i<n; i++){
            for (int j=0; j<=i;j++) {
                System.out.print(number+" ");
                number++;
            }
            System.out.println(" ");
        }
    }
}