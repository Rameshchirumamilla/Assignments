package GeekSter_assignments;

import java.util.Scanner;

public class SetOfSumEvOd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int sum1=0,sum=0;
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(a[i]%2==0) {
				sum1=sum1+a[i];
			}
			else
				sum=sum+a[i];
		}
    System.out.println(sum1+" Even Sum ");
    System.out.println(sum+" Odd Sum");
	}

}
