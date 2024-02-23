package Chuong_1;

import java.util.Scanner;

public class Bai18 {
	int tonguoc(int n) {
		int sum = 0;
		for(int i = 1; i<n;i++) {
			if (n%i == 0) sum += i;
		}
		return sum;
	}
	Boolean kiemtra (int n) {
		if (n < 0) return false;
		Bai18 s = new Bai18();
		
		if(s.tonguoc(n) == n )return true;
		else return false;
	}
	public static void main (String arg[]) {
		Bai18 s = new Bai18();
		Scanner sc = new Scanner(System.in);
		for(int i= 1; i<=1000;i++) {
			if (s.kiemtra(i)) System.out.print(i + " ");
		}
		sc.close();
	}
}
