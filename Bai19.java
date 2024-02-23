package Chuong_1;

import java.util.Scanner;

public class Bai19 {
	public static void main (String arg[]) {
		Bai19 s = new Bai19();
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n: ");
		n = sc.nextInt();
		int[] a = new int[100];
		for (int i =  0;  i < 100;i++) {
			a[i] = 0;
		}
		s.intFib(n,a);
		for(int i = 0; i< 100; i++) {
			if (a[i] <= n && a[i] !=0) System.out.print(a[i] + " ");
		}
		sc.close();
	}
	 void intFib(int n, int[] a) {
		int temp0 = 0,temp1 = 1, sum = 1;
		int i =0;
		while(sum <= n) {
			a[i] = sum;
			i++;
			sum = temp0 +temp1;
			temp0 = temp1;
			temp1 = sum;
//			System.out.print(sum + " ");
		}
		
	}
}
