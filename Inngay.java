package Chuong_1;
import java.util.Scanner;

public class Inngay {
	void in(int m, int y) {
		int[] a = {31,28,31,30,31,30,31,31,30,31,30,31};
		int[] b = {31,29,31,30,31,30,31,31,30,31,30,31};
		if (m < 1 || m > 12) {
			System.out.print("Ko ton tai thang nay !");
			return;
		}
		if (y%4 == 0) System.out.print("So ngày = " + b[m-1]);
		else System.out.print("So ngay = " + a[m-1]);
	}
	public static void main(String arg[]) {
		Inngay i = new Inngay();
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap thang,nam: ");
		a = sc.nextInt();
		b = sc.nextInt();
		i.in(a, b);
		sc.close();
	}
}
