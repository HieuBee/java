package Ktr;

import java.util.Scanner;

public class truongphong extends person {
	private int HeSoCV;
	
	public truongphong() {
		
	}
	
	public truongphong(int hesocv) {
		super();
		this.HeSoCV = hesocv;
	}
	
	public void setHesocv(int hesocv) {
		this.HeSoCV = hesocv;
	}
	public int getHesocv() {
		return HeSoCV;
	}
	
	public void NhapThongTin(int hesocv) {
		this.HeSoCV = hesocv;
	}
	
	public void NhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap thong tin truong phong: ");
		super.NhapThongTin();
		System.out.println("Nhap he so cong viec: ");
		HeSoCV = sc.nextInt();
	}
	
	public void HienThongTin() {
		super.HienThongTin();
		System.out.println("He so cong viec: " + HeSoCV);
		
	}
	
	public void TinhLuong() {
		int Ltp = getHsl() * 210 + HeSoCV * 210;
		System.out.println("Luong truong phong la:" + Ltp );
		System.out.println("________________________");
	}
}
