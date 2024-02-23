package Chuong_1;

import java.util.Scanner;

public class Bai20 {
	void kiemtra (int n) {
		if (n < 0) return ;
		Bai19 temp = new Bai19();
		int[] a = new int[100];
		for (int i =  0;  i < 100;i++) {
			a[i] = 0;
		}
		temp.intFib(n, a);
		int i = 0;
		while(a[i] != 0) {
			if (n == a[i]) {
				System.out.print(n + " là phan tu thứ " + (i + 1) + " thuoc day Fibonaci");
				return;
			}
			i++;
		}
		System.out.print(n + " ko thuoc day Fibonaci");
	}
	public static void main (String arg[]) {
		Bai20 s = new Bai20();
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n: ");
		n = sc.nextInt();
		s.kiemtra(n);
		sc.close();
	}
}
