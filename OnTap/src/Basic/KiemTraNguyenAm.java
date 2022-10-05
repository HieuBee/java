package Basic;
import java.util.Scanner;

public class KiemTraNguyenAm {
	public static void main(String[]args) {
		boolean isVowel = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ki tu ban muon kiem tra");
		char ch = sc.next().charAt(0);
		switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			isVowel = true;
		}
		if (isVowel == true) {
			System.out.println("La nguyen am");
		}else {
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				System.out.println("La phu am");
			}else{
				System.out.println("Ki tu ban nhap khong phu hop");
			}
		}
	}
}
