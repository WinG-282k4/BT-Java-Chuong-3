package Chuong_1;

import java.util.Scanner;

class ptbachai {
	float denta(float a, float b, float c) {
		float x = 0;
		x = b*b - 4*a*c;
		return x;
	}
	void giai(float a, float b, float c) {
		ptbachai pt2 = new ptbachai();
		float x = pt2.denta(a,b,c);
		ptbacnhat pt = new ptbacnhat();
		if (a == 0 ) pt.giai(b, c);
		else if (x > 0) {
			float can = (float) java.lang.Math.sqrt(x);
			System.out.print("Pt co 2 nghiem phan biet: ");
			System.out.print("x1 = " + (-b + can)/(2*a));
			System.out.print("x1 = " + (-b - can)/(2*a));
		}
		else if (x == 0) System.out.print("Pt cos nghiem kep: " + -b/2*a) ;
		else System.out.print("PT vo nghiem");
	}
	public static void main(String arg[]) {
		float a,b,c;
		ptbachai pt2 = new ptbachai();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap he so a,b,c : ");
		a = sc.nextFloat();
		b= sc.nextFloat();
		c = sc.nextFloat();
		pt2.giai(a, b, c);
		sc.close();
	}
}
