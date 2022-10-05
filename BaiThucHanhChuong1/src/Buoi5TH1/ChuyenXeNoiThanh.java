package Buoi5TH1;

public class ChuyenXeNoiThanh {
	private String masochuyen;
	private String hotentaixe;
	private int soxe;
	private int sotuyen;
	private int sokmdidc;
	private int doanhthu;
	
	public ChuyenXeNoiThanh() {
		
	}
	
	public ChuyenXeNoiThanh(String msc, String httx, int sx, int st, int skdd, int dt) {
		this.masochuyen = msc;
		this.hotentaixe = httx;
		this.soxe = sx;
		this.sotuyen = st;
		this.sokmdidc = skdd;
		this.doanhthu = dt;
	}
	
	public void setMsc(String msc) {
		this.masochuyen = msc;
	}
	public String getMsc() {
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
	public void setSt(int st) {
		this.sotuyen = st;
	}
	public int getSt() {
		return sotuyen;
	}
	public void setSkdd(int skdd) {
		this.sokmdidc = skdd;
	}
	public int getSkdd() {
		return sokmdidc;
	}
	public void setDt(int dt) {
		this.doanhthu = dt;
	}
	public int getDt() {
		return doanhthu;
	}
}
