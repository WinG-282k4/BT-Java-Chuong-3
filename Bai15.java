package Chuong_1;
import java.util.Scanner;
import java.lang.Math;

public class Bai15 {
	Boolean kiemtra (double n) {
		if (n < 0) return false;
		double x;
		x = Math.sqrt(n)%((int)Math.sqrt(n));
		if(x == 0.0)return true;
		else return false;
	}
	public static void main (String arg[]) {
		Bai15 s = new Bai15();
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n: ");
		n = sc.nextInt();
		if(s.kiemtra(n)) System.out.println(n + " là số chính phương");
		else System.out.println(n + " ko là số chính phương");
		sc.close();
	}
}
