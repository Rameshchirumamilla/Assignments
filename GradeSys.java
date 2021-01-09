package GeekSter_assignments;

import java.util.Scanner;

public class GradeSys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the grade");
		int gd = sc.nextInt();
		if(gd>80)
			System.out.println("A");
		else if(gd>60 && gd<=80)
			System.out.println("B");
		else if(gd>50 && gd<=60)
			System.out.println("C");
		else if(gd>45 && gd<=50)
			System.out.println("D");
		else if(gd>=25 && gd<=45)
			System.out.println("E");
		else
			System.out.println("F");
		

	}

}
