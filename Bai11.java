package Chuong_1;
import java.util.Scanner;
import java.math.BigInteger;

public class Bai11 {
	BigInteger tinh(int n) {
		BigInteger kq = BigInteger.ONE;
		int x = n;
		while( x >= 2){
			kq = kq.multiply(BigInteger.valueOf(x));
			x -= 2;
		}
		return kq;
	}
	public static void main (String arg[]) {
		Bai11 s = new Bai11();
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n: ");
		n = sc.nextInt();
		System.out.println("S = " + s.tinh(n));
		sc.close();
	}
}
