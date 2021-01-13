package GeekSter_assignments;

import java.util.Scanner;

public class FirstAndLstDig {
	   public static int FirstDig(int n) {
		    while(n>=10) {
		    	n=n/10;	
		    }
		    return n;
	   }
   public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(FirstDig(n)+" is First Digit "+(n%10)+" is last Digit");

	}

}
