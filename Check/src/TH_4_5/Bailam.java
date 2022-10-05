package TH_4_5;

import java.util.Scanner;

public class Bailam {
	private int Age;
	
	public Bailam() {
		
	}
	
	public Bailam(int age) {
		this.Age = age;
	}
	
	public void setAge(int age) {
		this.Age = age;
	}
	public int getAge() {
		return Age;
	}
	
	public void nhap() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap tuoi cua ban: ");
			Age = sc.nextInt();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void hienthi() {
		try {
			if(Age > 0) {
				System.out.println("Tuoi cua ban la : " + Age);
			}else {
				System.out.println("Kieu ban nhap chua dung. ");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());;
		}
		
	}
}
