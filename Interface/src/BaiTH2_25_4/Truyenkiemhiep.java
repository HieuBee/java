package BaiTH2_25_4;

import java.util.Scanner;

public class Truyenkiemhiep extends Sach implements ISach {
	private String TheLoaiTruyen;
	
	public Truyenkiemhiep() {
		
	}
	
	public void Truyenkiemkiep(String theloaitruyen, int id, String tensach, String tacgia, String nhaxuatban) {
		super.Sach(id, tensach, tacgia, nhaxuatban);
		this.TheLoaiTruyen = theloaitruyen;
	}
	
	public void setTheloaitruyen(String theloaitruyen) {
		this.TheLoaiTruyen = theloaitruyen;
	}
	public String getTheloaitruyen() {
		return TheLoaiTruyen;
	}
	
	public void nhapnoidung() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Truyen kiem hiep");
		super.nhapnoidung();
		System.out.println("Nhap the loai truyen: ");
		TheLoaiTruyen = sc.next();
	}

	public void hienthinoidung() {
		super.hienthinoidung();
		System.out.println("The loai truyen: " + TheLoaiTruyen);
		System.out.println("<------------------->");

	}
}
