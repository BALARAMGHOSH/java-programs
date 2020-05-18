import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        int num,reverse=0,realNum;
        System.out.println("Enter the number to check: ");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        realNum=num;
        while (num!=0) {
            reverse=reverse*10;
            reverse=reverse+ num%10;
            num=num/10;
        }
        if(realNum==reverse)
            System.out.println("the number is a palindrome.");
            else
            System.out.println("the number is not a palindrome.");

    }
}