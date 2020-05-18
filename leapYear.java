import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        boolean leap=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the year to check that it's a leap year or not: ");
        int year=sc.nextInt();
        if (year%4==0) {
            if (year%100==0) {
                if (year%400==0) {
                    leap=true;
                } else {
                    leap=false;
                }
            } else {
                leap=true;
            }
        } else {
            leap =false;
        }
        if (leap) {
            System.out.println(year+" is a leap year");
        } else {
            System.out.println(year+" is not a leap year");
        }
    }
}