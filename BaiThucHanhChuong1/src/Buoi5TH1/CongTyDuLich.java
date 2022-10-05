package Buoi5TH1;

public class CongTyDuLich {
	private String masochuyen;
	private String hotentaixe;
	private String noiden;
	private int soxe;
	private int doanhthu;
	private int songaydidc;
	
	public CongTyDuLich() {
		
	}
	
	public CongTyDuLich(String msc, String httx, String nd, int sx, int sndd, int dt) {
		this.masochuyen = msc;
		this.hotentaixe = httx;
		this.noiden = nd;
		this.soxe = sx;
		this.doanhthu = dt;
		this.songaydidc = sndd;
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
}
