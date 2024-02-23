package Chuong_1;

import java.util.Scanner;

public class Bai12 {
	int tinh(int n) {
		int kq = 0;
		do {
			kq += n%10;
			n = n/10;
		}while(n%10 !=0);
		return kq;
	}
	public static void main (String arg[]) {
		Bai12 s = new Bai12();
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n: ");
		n = sc.nextInt();
		System.out.println("S = " + s.tinh(n));
		sc.close();
	}
}
