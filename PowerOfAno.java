package GeekSter_assignments;

import java.util.Scanner;

public class PowerOfANo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = sc.nextInt();
		int p1=1;
		for(int i=1;i<=p;i++) {
			p1=p1*n;
		}
		System.out.println(p1+" is the power of a number");
	}

}
