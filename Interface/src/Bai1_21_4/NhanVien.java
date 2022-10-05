package Bai1_21_4;

import java.util.Scanner;

public class NhanVien implements IPerson {
	public int ID;
	public String HoTen;
	public int Tuoi;
	public String GioiTinh;
	public String DiaChi;
	
	public NhanVien() {
		
	}
	
	public NhanVien(int id, String name, int age, String sex, String diachi) {
		ID = id;
		HoTen = name;
		Tuoi = age;
		GioiTinh = sex;
		DiaChi = diachi;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhan vien");
		System.out.println("Nhap ID: ");
		ID = sc.nextInt();
		
		System.out.println("Nhap Ho ten: ");
		HoTen = sc.next();
		
		System.out.println("Nhap Tuoi: ");
		Tuoi = sc.nextInt();
		
		System.out.println("Nhap Gioi tinh: ");
		GioiTinh = sc.next();
		
		System.out.println("Nhap Dia chi: ");
		DiaChi = sc.next();
	}
	
	public void hienthi() {
		System.out.println("__________");
		System.out.println("Nhan vien");
		System.out.println("ID: " + ID);
		System.out.println("Ho ten: " + HoTen);
		System.out.println("Tuoi: " + Tuoi);
		System.out.println("Gioi tinh: " + GioiTinh);
		System.out.println("Dia chi: " + DiaChi);	
		System.out.println("__________");
	}
}
