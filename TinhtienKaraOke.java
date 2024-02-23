package Chuong_1;

import java.util.Scanner;

public class TinhtienKaraOke {
	int Tinhtien(int a, int b) {
		int x = 0;
		if(b<18) x = (b-a) * 45000;
		else x = (b-a) * 60000;
		return x;
	}
	public static void main (String arg[]) {
		TinhtienKaraOke t = new TinhtienKaraOke();
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap gio den, gio ket thuc: ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.print("Tien hat KaraOke la: " + t.Tinhtien(a,b));
		sc.close();
	}
}
