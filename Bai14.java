package Chuong_1;
import java.util.Scanner;

public class Bai14 {
	Boolean kiemtra (int x) {
		if (x < 1) return false;
		for(int i = 2; i < x; i++) 
			if (x%i == 0) return false;
	return true;
	}
	public static void main (String arg[]) {
		Bai14 s = new Bai14();
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n: ");
		n = sc.nextInt();
		if(s.kiemtra(n)) System.out.println(n + " là số nguyên tố");
		else System.out.println(n + " ko là số nguyên tố");
		sc.close();
	}
}
