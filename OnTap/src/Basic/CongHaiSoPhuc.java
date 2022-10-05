package Basic;

import java.util.Scanner;

public class CongHaiSoPhuc {
	public static void main(String[]args) {
		double tongz, tonga, tongb, z, z1, a, a1, b, b1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so phuc dau tien");
		z = sc.nextDouble();
		a = sc.nextDouble();
		b = sc.nextDouble();
		System.out.println("So phuc ban vua nhap la:" +z+ " = " +a+ " + " +b+ "i");
		System.out.println("Nhap so phuc thu hai");
		z1 = sc.nextDouble();
		a1 = sc.nextDouble();
		b1 = sc.nextDouble();
		System.out.println("So phuc ban vua nhap la:" +z1+ " = " +a1+ " + " +b1+ "i");
		tongz = z + z1;
		tonga = a + a1;
		tongb = b + b1;
		System.out.println("Tong hai so phuc la: " +tongz+ " = " +tonga+ " + " +tongb+ "i");
	}
}
