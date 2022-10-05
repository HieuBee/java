package Bai1_21_4;

import java.util.Scanner;

public class Student extends NhanVien implements IStudent {
	public int ID;
	public String HoTen;
	public int Tuoi;
	public String GioiTinh;
	public String DiaChi;
	public int Lop;
	public String Khoa;
	public float DiemTB;
	
	public Student() {
		
	}
	
	public Student(int id, String name, int age, String sex, String diachi, int lop, String khoa, int diemtb) {
		ID = id;
		HoTen = name;
		Tuoi = age;
		GioiTinh = sex;
		DiaChi = diachi;
		Lop = lop;
		Khoa = khoa;
		DiemTB = diemtb;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Student");
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
		
		System.out.println("Nhap Lop: ");
		Lop = sc.nextInt();
		
		System.out.println("Nhap Khoa: ");
		Khoa = sc.next();
		
		System.out.println("Nhap Diem TB: ");
		DiemTB = sc.nextFloat();
	}
	
	public void hienthi() {
		System.out.println("__________");
		System.out.println("ID: " + ID);
		System.out.println("Ho ten: " + HoTen);
		System.out.println("Tuoi: " + Tuoi);
		System.out.println("Gioi tinh: " + GioiTinh);
		System.out.println("Dia chi: " + DiaChi);
		System.out.println("Lop: " + Lop);
		System.out.println("Khoa: " + Khoa);
		System.out.println("Diem TB: " + DiemTB);
		System.out.println("__________");
	}

	public void nhapdiem() {

	}
}
