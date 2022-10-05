package Basic;

import java.util.Scanner;

public class KiemTraNamNhuan {
	public static void main(String[]args) {
		int nam;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap nam ban muon ktr: ");
		nam = sc.nextInt();
		if(nam%400 ==0) {
			System.out.println("Day la nam nhuan");
			if(nam%4 == 0 && nam%100 !=0) {
				System.out.println("Day la nam nhuan");
			}else {
				System.out.println("Day khong phai la nam nhuan");
			}
		}else{
			System.out.println("Day khong phai la nam nhuan");
		}
	}
}
