package TH_2_3;

import java.util.Scanner;

public class Person {
	private int tuoi;
	private String ten;
	
	public Person() {
		
	}
	
	public Person(int age, String name) {
		this.ten = name;
		this.tuoi = age;
	}
	public void setTuoi(int age) {
		this.tuoi = age;
	}
	public int  getTuoi() {
		return tuoi;
	}
	public void setName(String name) {
		this.ten = name;
	}
	public String  getTen() {
		return ten;
	}

	public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ten cua ban: "); 
        ten=sc.next();
        System.out.println("Tuoi cua ban: "); 
        tuoi=sc.nextInt();
    }
}
