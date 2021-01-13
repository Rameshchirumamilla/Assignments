package GeekSter_assignments;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scv = new Scanner(System.in);
		int n = scv.nextInt();
		int a = n;
		int sum=0;
		while(a!=0) {
			int rem = a%10;
			sum=sum*10+rem;
			a=a/10;
		}
      System.out.println((sum==n)?"PALINDROME":"Not a PALINDROME");
	}

}
