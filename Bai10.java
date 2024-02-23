package Chuong_1;

import java.util.Scanner;

public class Bai10 {
	float tinh(int n) {
		float kq = 1;
		int x =3,a =1;
		while( x <= 2*n -1 ){
			a *= x*(x-1); 
			kq += (float) 1/a;
			x += 2;
		}
		return kq;
	}
	public static void main (String arg[]) {
		Bai10 s = new Bai10();
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n: ");
		n = sc.nextInt();
		System.out.println("S = " + s.tinh(n));
		sc.close();
	}
}
