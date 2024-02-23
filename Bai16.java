package Chuong_1;

import java.util.Scanner;

public class Bai16 {
	Boolean kiemtra (int n) {
		if (n < 0) return false;
		if (n < 10) return true;
		int temp = n, sum = 0, r;
		for (; n!= 0 ; n = n/10) {
			r = n%10;
			sum = sum*10 + r;
		}
		if(temp == sum )return true;
		else return false;
	}
	public static void main (String arg[]) {
		Bai16 s = new Bai16();
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n: ");
		n = sc.nextInt();
		if(s.kiemtra(n)) System.out.println(n + " là số đối xứng");
		else System.out.println(n + " ko là số đối xứng");
		sc.close();
	}
}
