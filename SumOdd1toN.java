package GeekSter_assignments;

import java.util.Scanner;

public class SumOdd1toN {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number : ");
	int n = sc.nextInt();
	int sumOdd=0;
	for(int i=1;i<=n;i=i+2)
		sumOdd=sumOdd+i;
	System.out.println(sumOdd);
	}

}
