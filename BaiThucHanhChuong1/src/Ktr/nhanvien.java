package Ktr;

import java.util.Scanner;

public class nhanvien extends person {
	private int phongban;
	
	public nhanvien() {
		
	}
	
	public nhanvien(int PhongBan) {
		super();
		this.phongban = PhongBan;
	}
	
	public void setNhanvien(int PhongBan) {
		this.phongban = PhongBan;
	}
	public int getNhanvien() {
		return phongban;
	}
	
	public void NhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap thong tin nhan vien: ");
		super.NhapThongTin();
		System.out.println("Nhap phong ban: ");
		phongban = sc.nextInt();
	}
	
	public void NhapThongTin(int PhongBan) {
		this.phongban = PhongBan;
	}
	
	public void HienThongTin() {
		super.HienThongTin();
		System.out.println("Phong Ban: " + phongban);
	}
	
	public void TinhLuong() {
		int Lnv = getHsl() * 210;
		System.out.println("Luong la:" + Lnv );
		System.out.println("________________________");
	}
}
