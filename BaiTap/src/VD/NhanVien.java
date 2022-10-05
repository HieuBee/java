package VD;

import java.util.Scanner;

public class NhanVien extends Nguoi implements INguoi{
	private int HSL, PhongBan;
	
	public NhanVien() {
		
	}
	
	public NhanVien(int hSL, int phongBan,int maNhanVien, String tenNhanVien, int tuoi, String gioiTinh, String diaChi) {
		super(maNhanVien, tenNhanVien, tuoi, gioiTinh, diaChi);
		HSL = hSL;
		PhongBan = phongBan;
	}

	public int getHSL() {
		return HSL;
	}

	public void setHSL(int hSL) {
		HSL = hSL;
	}

	public int getPhongBan() {
		return PhongBan;
	}

	public void setPhongBan(int phongBan) {
		PhongBan = phongBan;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.println("Nhap HSL");
		this.HSL = sc.nextInt();
		System.out.println("Nhap phong ban");
		this.PhongBan = sc.nextInt();
	}
	
	@Override
	public double TinhLuong() {
		double luongNV =  HSL * LuongCB ;
		return luongNV;
	}

	public void xuat() {
		super.xuat();
		System.out.println("HSL" + getHSL());
		System.out.println("Phong Ban" + getPhongBan());
		System.out.println("Luong nhan vien" + TinhLuong());

	}
}
