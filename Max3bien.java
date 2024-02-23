package Chuong_1;

import java.util.Scanner;

public class Max3bien {
	int Max(int a, int b, int c) {
		if (a > b) {
			if (a>c) return a;
			else return c;
		}
		else {
			if (b>c) return b;
			else return c;
		}
	}
	public static void main (String g[]) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap 3 so a, b ,c:");
		a = sc. nextInt();
		b = sc. nextInt();
		c = sc. nextInt();
		Max3bien obj = new Max3bien();
		System.out.println(obj.Max(a, b , c));
		sc.close();
	}
}
