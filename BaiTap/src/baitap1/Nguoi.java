package baitap1;

import java.util.Scanner;

public class Nguoi {
	private String maNV, tenNV, gioiTinh, diaChi;
	private int tuoi;
	
	public Nguoi() {

	}

	public Nguoi(String maNV, String tenNV, String gioiTinh, String diaChi, int tuoi) {
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
		this.tuoi = tuoi;
	}

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getTenNV() {
		return tenNV;
	}

	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma nhan vien: ");
		this.maNV = sc.next();
		System.out.print("Nhap ten nhan vien: ");
		this.tenNV = sc.next();
		System.out.print("Nhap gioi tinh: ");
		this.gioiTinh = sc.next();
		System.out.print("Nhap dia chi: ");
		this.diaChi = sc.next();
		System.out.print("Nhap tuoi: ");
		this.tuoi = sc.nextInt();
	}
	
	public void hienThi() {
		System.out.println("Ma nhan vien: " + maNV);
		System.out.println("Ten nhan vien: " + tenNV);
		System.out.println("Gioi tinh: " + gioiTinh);
		System.out.println("Dia chi: " + diaChi);
		System.out.println("Tuoi: " + tuoi);
	}
}
