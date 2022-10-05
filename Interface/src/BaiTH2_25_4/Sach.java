package BaiTH2_25_4;

import java.util.Scanner;

public class Sach {
	private int ID;
	private String TenSach;
	private String TacGia;
	private String NhaXuatBan;
	
	public Sach() {
		
	}
	
	public void Sach(int id, String tensach, String tacgia, String nhaxuatban) {
		this.ID = id;
		this.TenSach = tensach;
		this.TacGia = tacgia;
		this.NhaXuatBan = nhaxuatban;
	}
	
	public void setId(int id) {
		this.ID = id;
	}
	public int getId() {
		return ID;
	}
	
	public void setTensach(String tensach) {
		this.TenSach = tensach;
	}
	public String getTensach() {
		return TenSach;
	}
	
	public void setTacgia(String tacgia) {
		this.TacGia = tacgia;
	}
	public String getTacgia() {
		return TacGia;
	}
	
	public void setNhaxuatban(String nhaxuatban) {
		this.NhaXuatBan = nhaxuatban;
	}
	public String getNhaxuatban() {
		return NhaXuatBan;
	}
	
	public void nhapnoidung() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap id: ");
		ID = sc.nextInt();
		
		System.out.println("Nhap ten sach: ");
		TenSach = sc.next();
		
		System.out.println("Nhap tac gia: ");
		TacGia = sc.next();
		
		System.out.println("Nhap nha xuat ban: ");
		NhaXuatBan = sc.next();
	}

	public void hienthinoidung() {
		System.out.println("<------------------->");
		System.out.println("Id: " + ID);
		System.out.println("Ten sach: " + TenSach);
		System.out.println("Tac gia: " + TacGia);
		System.out.println("Nha xuat ban: " + NhaXuatBan);
		System.out.println("<------------------->");
	}
}
