package VD;

import java.util.Scanner;

public class Nguoi {
	private int maNhanVien;
	private String tenNhanVien;
	private int tuoi;
	private String gioiTinh;
	private String diaChi;
	
	public Nguoi() {
		
	}
	
	public Nguoi(int maNhanVien, String tenNhanVien, int tuoi, String gioiTinh, String diaChi) {
		super();
		this.maNhanVien = maNhanVien;
		this.tenNhanVien = tenNhanVien;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
	}

	public int getMaNhanVien() {
		return maNhanVien;
	}

	public void setMaNhanVien(int maNhanVien) {
		this.maNhanVien = maNhanVien;
	}

	public String getTenNhanVien() {
		return tenNhanVien;
	}

	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
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
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap Ma nhan vien");
		this.maNhanVien = sc.nextInt();
		System.out.println("Nhap Ten nhan vien");
		this.tenNhanVien = sc.next();
		System.out.println("Nhap Tuoi");
		this.tuoi = sc.nextInt();
		System.out.println("Nhap Gioi tinh");
		this.gioiTinh = sc.next();
		System.out.println("Nhap Dia chi");
		this.diaChi = sc.next();
	}
	
	public void xuat() {
		System.out.println("Ma nhan vien" + getMaNhanVien());
		System.out.println("Ten nhan vien" + getTenNhanVien());
		System.out.println("Tuoi" + getTuoi());
		System.out.println("Gioi tinh" + getGioiTinh());
		System.out.println("Dia chi" + getDiaChi());
	}
}
