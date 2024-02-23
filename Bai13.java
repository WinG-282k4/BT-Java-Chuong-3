package Chuong_1;
import java.util.Scanner;

public class Bai13 {
	int UCLN(int a, int b) {
		  int r = a % b;       
		    while (r!=0) {
		        a = b;  
		        b = r;
		        r = a % b;
		    }
		    return b;
	}
	public static void main (String arg[]) {
		Bai13 s = new Bai13();
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a,b: ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("UCLN = " + s.UCLN(a,b));
		System.out.println("BCNN = " + (a*b)/s.UCLN(a,b));
		sc.close();
	}
}
