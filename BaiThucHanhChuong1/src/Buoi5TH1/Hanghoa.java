package Buoi5TH1;

public class Hanghoa {
	private String mahang;
	private String tenhang;
	private int gia;
	private int soluong;
	
	public Hanghoa() {
		
	}
	public Hanghoa(String mh, String th, int g, int sl) {
		this.mahang = mh;
		this.tenhang = th;
		this.gia = g;
		this.soluong = sl;
	}
	public void setMh(String mh) {
		this.mahang = mh;
	}
	public String getMh() {
		return mahang;
	}
	public void setTh(String th) {
		this.tenhang = th;
	}
	public String getTh() {
		return tenhang;
	}
	public void setG(int g) {
		this.gia = g;
	}
	public int getG() {
		return gia;
	}
	public void setSl(int sl) {
		this.soluong = sl;
	}
	public int getSl() {
		return soluong;
	}
	public int tinhtong() {
		return soluong * gia;
	}
	public double tinhtong(double giamgia) {
		return (double) ((soluong * gia) - (soluong * gia * giamgia));
	}
}
