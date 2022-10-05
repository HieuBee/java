package Buoi5TH1;

import java.util.Scanner;

public class ChuyenXeNgoaiThanh {
	private int masochuyen;
	private String hotentaixe;
	private int soxe;
	private int doanhthu;
	private int songaydidc;
	private String noiden;
	
	public ChuyenXeNgoaiThanh() {
		
	}
	public ChuyenXeNgoaiThanh(int msc, String httx, String nd, int sx, int sndd, int dt) {
		this.masochuyen = msc;
		this.hotentaixe = httx;
		this.noiden = nd;
		this.soxe = sx;
		this.doanhthu = dt;
		this.songaydidc = sndd;
	}
	
	public void setMsc(int msc) {
		this.masochuyen = msc;
	}
	public int getMsc() {
		return masochuyen;
	}
	public void setHttx(String httx) {
		this.hotentaixe = httx;
	}
	public String getHttx() {
		return hotentaixe;
	}
	public void setNd(String nd) {
		this.noiden = nd;
	}
	public String getNd() {
		return noiden;
	}
	public void setSx(int sx) {
		this.soxe = sx;
	}
	public int getSx() {
		return soxe;
	}
	public void setSndd(int sndd) {
		this.songaydidc = sndd;
	}
	public int getSndd() {
		return songaydidc;
	}
	public void setDt(int dt) {
		this.doanhthu = dt;
	}
	public int getDt() {
		return doanhthu;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap thong tin chuyen xe ngoai thanh ");
		System.out.println("Nhap ma so chuyen xe: ");
		masochuyen = sc.nextInt();
		
		System.out.println("Nhap ho ten tai xe: ");
		hotentaixe = sc.next();
		
		System.out.println("Nhap so xe: ");
		soxe = sc.nextInt();
		
		System.out.println("So ngay di duoc: ");
		songaydidc = sc.nextInt();
		
		System.out.println("Nhap noi den: ");
		noiden = sc.next();
		
		System.out.println("Doanh thu co duoc: ");
		doanhthu = sc.nextInt();
	}
	
	public void nhap(int msc, String httx, String nd, int sx, int sndd, int dt) {
		this.masochuyen = msc;
		this.hotentaixe = httx;
		this.noiden = nd;
		this.soxe = sx;
		this.doanhthu = dt;
		this.songaydidc = sndd;
	}
	
	public void hienthi() {
		System.out.println("________________________");
		System.out.println("Ma so chuyen xe: " + masochuyen);
		System.out.println("Ho ten tai xe: " + hotentaixe);
		System.out.println("So xe: " + soxe);
		System.out.println("Noi den: " + noiden);
		System.out.println("So ngay di duoc: " + songaydidc);
		System.out.println("Doanh thi: " + doanhthu);
		System.out.println("________________________");
		
	}
	
}
