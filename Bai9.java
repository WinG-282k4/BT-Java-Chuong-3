package Chuong_1;
import java.util.Scanner;

public class Bai9 {
	float tinh(int n) {
		float kq = 0;
		int x =1,a =1;
		while( x <= n ){
			a *= -x; 
			kq += (float) 1/a;
			x++;
		}
		return 15+kq;
	}
	public static void main (String arg[]) {
		Bai9 s = new Bai9();
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n: ");
		n = sc.nextInt();
		System.out.println("S = " + s.tinh(n));
		sc.close();
	}
}
