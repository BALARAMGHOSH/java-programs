import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int fact=1,n;
        System.out.println("enter the number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=n;i>=1;i--){
            fact =fact *i;
        }
        System.out.println(fact);
    }
}