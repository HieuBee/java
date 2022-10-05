package TH_4_1;

import java.util.Scanner;

public class Bailam {
	private int a;
	private int b;
	
	public Bailam() {
		
	}
	
	public Bailam(int aa, int bb) {
		this.a = aa;
		this.b = bb; 
	}
	
	public void setA(int aa) {
		this.a = aa;
	}
	public int getA() {
		return a;
	}
	
	public void setB(int bb) {
		this.b = bb;
	}
	public int getB() {
		return b;
	}
	
	public void nhap(int aa, int bb) {
		this.a = aa;
		this.b = bb; 
	}
	public void nhap() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap a: ");
			a = sc.nextInt();
			
			System.out.println("Nhap b: ");
			b = sc.nextInt();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void hienthi() {
		try {
			System.out.println("So a la: " +a);
			System.out.println("So a la: " +b);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void tinh() {
		try {
			int Thuong = a/b;
			System.out.println("Thuong cua a va b la: " + Thuong);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
