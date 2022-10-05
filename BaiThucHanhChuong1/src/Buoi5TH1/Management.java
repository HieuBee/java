package Buoi5TH1;

public class Management {
	public static void main(String arg[]) {
		Hanghoa hh = new Hanghoa("tulanhsony", "TuLanh", 7, 5);
		System.out.println("Tong hang hoa la: " + hh.tinhtong());
		System.out.println("Tong hang hoa co giam gia la: " + hh.tinhtong(0.5));
	}
}