package Chuong_1;
import java.util.Scanner;

public class ptbacnhat {
	void giai(float a, float b) {
		if (a==0 && b != 0) System.out.print("PT vo nghiem");
		else if (a == 0 && b ==0) System.out.print("PT vo so nghiem");
		else if (b == 0) System.out.print("Pt co nghiem x = 0");
		else System.out.printf("Pt co nghiem x = "+ -b/a);
	}
	public static void main (String arg[]) {
		float a,b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap he so a,b: ");
		a = sc.nextFloat();
		b = sc.nextFloat();
		ptbacnhat pt = new ptbacnhat();
		pt.giai(a, b);
		sc.close();
	}
}
