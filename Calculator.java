package GeekSter_assignments;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the value");
	int n = sc.nextInt();
	switch(n) {
	case 1:
		   System.out.println("Enter the values for computation");
		   int a = sc.nextInt();
		   int b = sc.nextInt();
		   System.out.println(a+b);
		   break;
	case 2:
		   System.out.println("Enter the values for computation");
		   int a1 = sc.nextInt();
		   int b1 = sc.nextInt();
		   System.out.println(a1-b1);
		   break;
	case 3:
		System.out.println("Enter the values for computation");
		   int a2 = sc.nextInt();
		   int b2 = sc.nextInt();
		   System.out.println(a2*b2);
		   break;
	case 4:
		System.out.println("Enter the values for computation");
		   int a3 = sc.nextInt();
		   int b3 = sc.nextInt();
		   System.out.println(a3/b3);
		   break;
	case 5:
		System.out.println("Enter the values for computation");
		
		   int a4 = sc.nextInt();
		   int b4 = sc.nextInt();
		   System.out.println(a4%b4);
		   break;
	default:
		  System.out.println("TRY AGAIN!");
		  break;
	}
	

	}

}
