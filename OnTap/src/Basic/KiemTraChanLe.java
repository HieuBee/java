package Basic;

import java.util.Scanner;

public class KiemTraChanLe {
	public static void main(String[]args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so ban muon kiem tra: ");
		a = sc.nextInt();
		if(a%2 == 0) {
			System.out.println("So vua nhap la so chan");
		}else {
			System.out.println("So vua nhap la so le");
		}
	}
}
