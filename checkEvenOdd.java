package operator;

import java.util.*;

public class checkEvenOdd {

	public static void main(String[] args) {
		int c;
		System.out.println("enter the number that would be checken:\n");
		Scanner sc=new Scanner(System.in);
		c=sc.nextInt();
		
		if(c%2==0)
			System.out.println("number is even.");
		else
			System.out.println("number is odd.");
	}
}
