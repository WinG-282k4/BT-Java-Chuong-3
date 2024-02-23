package Chuong_1;
import java.util.Scanner;

public class Bai8 {
	float tinh(int n) {
		float kq = 0;
		int x =1;
		while( x <= n ){
			kq += (float) 1/x;
			x++;
		}
		return kq;
	}
	public static void main (String arg[]) {
		Bai8 s = new Bai8();
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n: ");
		n = sc.nextInt();
		System.out.println("S = " + s.tinh(n));
//		int v = 4;
//		v = v++ + ++v;
//		System.out.println(v);
		sc.close();
	}
}
