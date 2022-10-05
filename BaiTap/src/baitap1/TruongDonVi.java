package baitap1;

import java.util.Scanner;

public class TruongDonVi extends NhanVien {
	private int heSoChucVu;
	private String chucVu;
	
	public TruongDonVi() {

	}

	public TruongDonVi(String maNV, String tenNV, String gioiTinh, String diaChi, int tuoi, int hsl, int phongBan, int heSoChucVu, String chucVu) {
		super(maNV, tenNV, gioiTinh, diaChi, tuoi, hsl, phongBan);
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
		System.out.print("Nhap he so chuc vu: ");
		this.heSoChucVu = sc.nextInt();
		System.out.print("Nhap chuc vu: ");
		this.chucVu = sc.next();
	}
	
	public int tinhLuong() {
		int luong = getHsl() * LUONGCB + heSoChucVu * LUONGCB;
		return luong;
	}
	
	public void hienThi() {
		super.hienThi();
		System.out.println("He so chuc vu: " + heSoChucVu);
		System.out.println("Chuc vu: " + chucVu);
		System.out.println("Luong cua truong don vi nay la: " + tinhLuong());
	}
}
