package GeekSter_assignments;

import java.util.Scanner;

public class CountDigts {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int n= sc.nextInt();
		int count=0;
		while(n!=0) {
			int rem = n%10;
			count++;
			n=n/10;
		}
		System.out.println(count);
	}

}
