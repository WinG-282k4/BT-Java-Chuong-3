package Chuong_1;
import java.util.Scanner;

public class Sotrunggian {
	void STG(float a, float b, float c) {
		float temp = (b < a && a < c || c < a && a < b) ? a : (a < b && b < c || c < b && b < a) ? b : c;
		System.out.print("So trung gian: " + temp);
	}
	public static void main(String srg[] ) {
		float a,b,c;
		Sotrunggian stg = new Sotrunggian();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap 3 so a,b,c : ");
		a = sc.nextFloat();
		b= sc.nextFloat();
		c = sc.nextFloat();
		stg.STG(a,b,c);
		sc.close();
	}
}
