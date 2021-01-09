package GeekSter_assignments;

import java.util.Scanner;

public class Employee5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee sal and year");
		int sal  = sc.nextInt();
        int year = sc.nextInt();
        if(year>5) {
        	int emp_sal = sal+(sal/5);
        	System.out.println(emp_sal+" The total salary with bonus");
        }
        else
        {
        	System.out.println(sal);
        }

	}

}
