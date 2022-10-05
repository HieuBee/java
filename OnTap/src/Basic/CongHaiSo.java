package Basic;

import java.util.Scanner;

public class CongHaiSo {
	public static void main(String[]args) {
		int a, b, T;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so cong: ");
		a = sc.nextInt();
		System.out.println("Nhap so bi cong: ");
		b = sc.nextInt();
		T  = a + b;
		System.out.println("Tong: " + T);
	}
}
