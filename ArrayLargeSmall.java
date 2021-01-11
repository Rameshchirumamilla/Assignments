package GeekSter_assignments;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLarSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the values");
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println(a[n-1]+" is largest");
		System.out.println(a[0]+" is smallest");

	}

}
