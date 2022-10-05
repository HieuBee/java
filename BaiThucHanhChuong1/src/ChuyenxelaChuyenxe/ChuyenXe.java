package ChuyenxelaChuyenxe;

import java.util.Scanner;

public class ChuyenXe {
	private int masochuyen;
	private String hotentaixe;
	private int soxe;
	private int doanhthu;
	
	public ChuyenXe() {
		
	}
	public ChuyenXe(int msc, String httx, int sx, int dt) {
		this.masochuyen = msc;
		this.hotentaixe = httx;
		this.soxe = sx;
		this.doanhthu = dt;
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
	public void setSx(int sx) {
		this.soxe = sx;
	}
	public int getSx() {
		return soxe;
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

		System.out.println("Doanh thu co duoc: ");
		doanhthu = sc.nextInt();
	}
	public void nhap(int msc, String httx, String nd, int sx, int sndd, int dt) {
		this.masochuyen = msc;
		this.hotentaixe = httx;
		this.soxe = sx;
		this.doanhthu = dt;
	}
	
	public void hienthi() {
		System.out.println("________________________");
		System.out.println("Ma so chuyen xe: " + masochuyen);
		System.out.println("Ho ten tai xe: " + hotentaixe);
		System.out.println("So xe: " + soxe);
		System.out.println("Doanh thi: " + doanhthu);
		System.out.println("________________________");
		
	}
}
