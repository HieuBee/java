package Ktr;

import java.util.Scanner;

public class person {
	private int ID;
	private String hoTen;
	private String gioiTinh;
	private int tuoi;
	private int HSL;

	public person() {
		
	}
	
	public person(int id, String name, String gioitinh, int age, int hsl) {
		this.ID = id;
		this.hoTen = name;
		this.gioiTinh = name;
		this.tuoi = age;
		this.HSL = hsl;
	}
	
	public void setId(int id) {
		this.ID = id;
	}
	public int getId() {
		return ID;
	}
	
	public void setName(String name) {
		this.hoTen = name;
	}
	public String getName() {
		return hoTen;
	}
	
	public void setGioitinh(String gioitinh) {
		this.gioiTinh = gioitinh;
	}
	public String getGioitinh() {
		return gioiTinh;
	}
	
	public void setAge(int age) {
		this.tuoi = age;
	}
	public int getAge() {
		return tuoi;
	}
	
	public void setHsl(int hsl) {
		this.HSL = hsl;
	}
	public int getHsl() {
		return HSL;
	}
	
	public void NhapThongTin() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap ID: ");
		ID = sc.nextInt();
		
		System.out.println("Nhap Ho va ten: ");
		hoTen = sc.next();
		
		System.out.println("Nhap Gioi tinh: ");
		gioiTinh = sc.next();
		
		System.out.println("Nhap Tuoi: ");
		tuoi = sc.nextInt();
		
		System.out.println("Nhap HSL: ");
		HSL = sc.nextInt();
	}
	
	public void NhapThongTin(int id, String name, String gioitinh, int age, int hsl) {
		this.ID = id;
		this.hoTen = name;
		this.gioiTinh = name;
		this.tuoi = age;
		this.HSL = hsl;
	}
	
	public void HienThongTin() {
		System.out.println("________________________");
		System.out.println("ID: " + ID);
		System.out.println("Ho va ten: " + hoTen);
		System.out.println("Gioi tinh: " + gioiTinh);
		System.out.println("Tuoi: " + tuoi);
		System.out.println("HSL: " + HSL);
		
	}
	
	public void TinhLuong() {
		
	}
}
