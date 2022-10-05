package TH_4_3;

import java.util.Scanner;

public class Bailam {
	public double a;
	
	public Bailam() {
		
	}
	
	public Bailam(int aa) {
		this.a = aa;
	}
	
	public void setA(double aa) {
		this.a = aa;
	}
	public double getA() {
		return a;
	}
	
	public void nhap() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap a: ");
			a = sc.nextDouble();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void hienthi() {
		try {
			System.out.println("Cang bac 2 cua a la: " +  + Math.sqrt(a));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());;
		}
		
	}
}
