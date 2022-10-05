package baitap1;

import java.util.Scanner;

public class NhanVien extends Nguoi implements INguoi{
	private int hsl, phongBan;
	
	public NhanVien() {

	}

	public NhanVien(String maNV, String tenNV, String gioiTinh, String diaChi, int tuoi, int hsl, int phongBan) {
		super(maNV, tenNV, gioiTinh, diaChi, tuoi);
		this.hsl = hsl;
		this.phongBan = phongBan;
	}

	public int getHsl() {
		return hsl;
	}

	public void setHsl(int hsl) {
		this.hsl = hsl;
	}

	public int getPhongBan() {
		return phongBan;
	}

	public void setPhongBan(int phongBan) {
		this.phongBan = phongBan;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.print("Nhap he so luong: ");
		this.hsl = sc.nextInt();
		System.out.print("Nhap phong ban: ");
		this.phongBan = sc.nextInt();
	}

	@Override
	public int tinhLuong() {
		int luong = LUONGCB * hsl;
		return luong;
	}
	
	public void hienThi() {
		super.hienThi();
		System.out.println("He so luong: " + hsl);
		System.out.println("Phong ban: " + phongBan);
		System.out.println("Luong cua nhan vien nay la: " + tinhLuong());
	}
}
