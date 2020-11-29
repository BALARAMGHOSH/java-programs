import java.util.Scanner;

public class operation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers for operation: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("If addition press 1.");
        System.out.println("If substraction press 2.");
        System.out.println("If multiplication press 3");
        System.out.println("If division press 4.");
        int operation=sc.nextInt();
        int ans=0;
        if (operation== 1) {
            ans=a+b;
        } else if (operation== 2){
            ans=a-b;
        } else if (operation== 3) {
            ans=a*b;
        } else if (operation== 4) {
            ans=a/b;
        }
        System.out.println("The answer is: "+ans);
    }
}
