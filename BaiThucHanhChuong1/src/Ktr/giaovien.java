package Ktr;

import java.util.Scanner;

public class giaovien extends person {
	private int ngachGiangVien;
	private int HSL_ThamNien;
	
	public giaovien() {
		
	}
	
	public giaovien(int ngachgianvien, int hsl_thamnien) {
		super();
		this.ngachGiangVien = ngachgianvien;
		this.HSL_ThamNien = hsl_thamnien;
	}
	
	public void setNgachgianvien(int ngachgianvien) {
		this.ngachGiangVien = ngachgianvien;
	}
	public int getNgachgianvien() {
		return ngachGiangVien;
	}
	
	public void setHslthamnien(int hsl_thamnien) {
		this.HSL_ThamNien = hsl_thamnien;
	}
	public int getHslthamnien() {
		return HSL_ThamNien;
	}
	
	public void NhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap thong tin giao vien: ");
		super.NhapThongTin();
		System.out.println("Nhap ngach giang vien: ");
		ngachGiangVien = sc.nextInt();
		
		System.out.println("Nhap HSL tham nien: ");
		HSL_ThamNien = sc.nextInt();
	}
	
	public void NhapThongTin(int ngachgianvien, int hsl_thamnien) {
		this.ngachGiangVien = ngachgianvien;
		this.HSL_ThamNien = hsl_thamnien;
	}
	
	public void HienThongTin() {
		super.HienThongTin();
		System.out.println("Ngach giang vien: " + ngachGiangVien);
		System.out.println("HSL tham nien: " + HSL_ThamNien);
	}
	
	public void TinhLuong() {
		int Lgv = getHsl() * 210 + HSL_ThamNien * 210;
		System.out.println("Luong la:" + Lgv );
		System.out.println("________________________");
	}
}
