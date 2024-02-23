package Chuong_1;
import java.util.Scanner;

public class hptbacnhat {
	void giai( float a, float b, float c, float d, float e, float f) {
		float D = a * e - d *b;
		float Dx = c * e - f * b;
		float Dy = a * f - d *c;
		if (D == 0) {
	        if (Dx + Dy == 0)
	            System.out.print( "He phuong trinh co vo so nghiem");
	        else
	        	System.out.print( "He phuong trinh vo nghiem");
	    }
	    else {
	        System.out.print( "He phuong trinh co nghiem \n");
	        System.out.print("x = " + Dx/D + "\n");
	        System.out.print( "y = " + Dy/D + "\n");
	    }
	}
	public static void main (String arg[]) {
		float a,b,c,d,e,f;
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap a,b,c: ");
		a = sc.nextFloat();
		b= sc.nextFloat();
		c = sc.nextFloat();
		System.out.print("nhap d,e,f: ");
		d = sc.nextFloat();
		e= sc.nextFloat();
		f = sc.nextFloat();
		hptbacnhat hpt = new hptbacnhat();
		hpt.giai(a, b, c, d, e, f);
		sc.close();
	}
}
