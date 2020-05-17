import java.util.Scanner;

public class reverseNum {
    public static void main(String[] args) {
        int num,reverse=0;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number:");
        num=in.nextInt();
        while (num!=0) {
            reverse=reverse*10;
            reverse=reverse+ num%10;
            num=num/10;
        }
        System.out.println("reverse number is "+reverse);
    }
}