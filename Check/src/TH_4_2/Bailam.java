package TH_4_2;

import java.util.Scanner;

public class Bailam {
	private int a;
	
	public Bailam() {
		
	}
	
	public Bailam(int aa) {
		this.a = aa;
	}
	
	public void setA(int aa) {
		this.a = aa;
	}
	public int getA() {
		return a;
	}
	
	public void nhap() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap a: ");
			a = sc.nextInt();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void hienthi() {
		try {
			System.out.println("So ban vua nhap la: " + a);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());;
		}
	}
}
