package VD;

import java.util.Scanner;

public class TruongDonVi extends NhanVien{
	private int heSoChucVu;
	private String chucVu;
	
	public TruongDonVi() {
		
	}

	public TruongDonVi(int heSoChucVu, String chucVu,int hSL, int phongBan,int maNhanVien, String tenNhanVien, int tuoi, String gioiTinh, String diaChi) {
		super(hSL, phongBan, maNhanVien, tenNhanVien, tuoi, gioiTinh, diaChi);
		this.heSoChucVu = heSoChucVu;
		this.chucVu = chucVu;
	}

	public int getHeSoChucVu() {
		return heSoChucVu;
	}

	public void setHeSoChucVu(int heSoChucVu) {
		this.heSoChucVu = heSoChucVu;
	}

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.println("Nhap he so chuc vu");
		this.heSoChucVu = sc.nextInt();
		System.out.println("Nhap chuc vu");
		this.chucVu = sc.next();
	}

	
	public double tinhLuongTDV() {
		double luongTDV = getHSL() * LuongCB + heSoChucVu *LuongCB;
		return luongTDV;
	}

	public void xuat() {
		super.xuat();
		System.out.println("He so chuc vu" + getHeSoChucVu());
		System.out.println("Chuc vu" + getChucVu());
		System.out.println("Luong truong don vi" + tinhLuongTDV());
	}
}
