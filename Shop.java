package GeekSter_assignments;

import java.util.Scanner;

public class Shop4A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the units");
		int units = sc.nextInt();
		int cost = units*100;
		int t_cost;
		if(cost>=1000) {
			t_cost = cost-(cost/10);
			System.out.println(t_cost);
		}
		else {
			System.out.println(cost);
		}
			

	}

}
