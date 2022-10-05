package BaiTH2_25_4;

import java.util.Scanner;

public class SachGiaoKhoa extends Sach implements ISach{
	private int Lop;
	private String theLoaiSach;
	private int GiaTien;
	
	public SachGiaoKhoa() {
		
	}
	
	public SachGiaoKhoa(int lop, String theloaisach, int giatien) {
		this.Lop = lop;
		this.theLoaiSach = theloaisach;
		this.GiaTien = giatien;
	}
	
	public void setLop(int lop) {
		this.Lop = lop;
	}
	public int getLop() {
		return Lop;
	}
	
	public void setTheloaisach(String theloaisach) {
		this.theLoaiSach = theloaisach;
	}
	public String getTheloaisach() {
		return theLoaiSach;
	}
	
	public void setGiatien(int giatien) {
		this.GiaTien = giatien;
	}
	public int getGiatien() {
		return GiaTien;
	}
	
	public void nhapnoidung() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Sach giao khoa");
		System.out.println("Nhap lop: ");
		Lop = sc.nextInt();
		
		System.out.println("Nhap the loai sach: ");
		theLoaiSach = sc.next();
		
		System.out.println("Nhap gia tien: ");
		GiaTien = sc.nextInt();
	}

	public void hienthinoidung() {
		System.out.println("<------------------->");
		System.out.println("Lop: " + Lop);
		System.out.println("The loai sach: " + theLoaiSach);
		System.out.println("Gia tien: " + GiaTien);
		System.out.println("<------------------->");

		
	}
	
}
