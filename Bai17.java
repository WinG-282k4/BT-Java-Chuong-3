package Chuong_1;

import java.util.Scanner;

public class Bai17 {
	void insnt(int n) {
		Bai14 kt = new Bai14();
		for (int i = 1; i <= n; i++) {
			if (kt.kiemtra(i)) System.out.print(i + " ");
		}
	}
	public static void main (String arg[]) {
		Bai17 s = new Bai17();
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n: ");
		n = sc.nextInt();
		s.insnt(n);
		sc.close();
	}
}
