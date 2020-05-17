import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        int n,a=3,status=5;
        System.out.println("enter the number of prime numbers that will be shown:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if (n >= 1)
      {
         System.out.println("First "+n+" prime numbers are:");
         System.out.println(2);
      }
        int j=2;
        while(j<=n) {
            for (int i = 2; (i*i)<=a; i++) {
                if(a%i==0){
                    status=0;
                    break;
                }
            }
            if(status!=0){
                System.out.println(a);
                j++;
            }
            status=1;
            a++;
            
        }
    }
}