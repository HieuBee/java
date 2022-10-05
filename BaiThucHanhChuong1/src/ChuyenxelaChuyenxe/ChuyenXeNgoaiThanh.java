package ChuyenxelaChuyenxe;

import java.util.Scanner;

public class ChuyenXeNgoaiThanh extends ChuyenXe {
	private int songaydidc;
	private String noiden;
	
	public ChuyenXeNgoaiThanh() {
		
	}
	public ChuyenXeNgoaiThanh(String nd, int sndd) {
		this.noiden = nd;
		this.songaydidc = sndd;
	}
	public void setSndd(int sndd) {
		this.songaydidc = sndd;
	}
	public int getSndd() {
		return songaydidc;
	}
	public void setNd(String nd) {
		this.noiden = nd;
	}
	public String getNd() {
		return noiden;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap thong tin chuyen xe ngoai thanh ");
		
		System.out.println("So ngay di duoc: ");
		songaydidc = sc.nextInt();
		
		System.out.println("Nhap noi den: ");
		noiden = sc.next();
	}
	
	public void nhap(int msc, String httx, String nd, int sx, int sndd, int dt) {
		this.noiden = nd;
		this.songaydidc = sndd;
	}
	
	public void hienthi() {
		System.out.println("________________________");
		System.out.println("Noi den: " + noiden);
		System.out.println("So ngay di duoc: " + songaydidc);
		System.out.println("________________________");
		
	}
}
