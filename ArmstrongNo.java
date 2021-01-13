package GeekSter_assignments;

import java.util.Scanner;

public class AmstrongNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number for finding Armstrg or Not");
		int n1= sc.nextInt();
		int n=n1;
		int a=n1;
		int count=0,sum=0,sum1=0;
		while(n!=0) {
			int rem = n%10;
			sum=sum+rem*rem*rem;
			count++;
			n=n/10;
		}
		while(n1!=0) {
			int rem = n1%10;
			sum1+=Math.pow(rem, count);
			n1=n1/10;
		}
		if(sum1==a)
			System.out.println(a+" is a ARMSTRONG Number");
		else
			System.out.println(a+" is not a ARMSTRONG Number");
	}

}
