package BaiTHend;

public class Nhan {
	public double a;
	public double b;
	public Nhan(double A, double B) {
		a = A;
		b = B;
	}
	
	public Nhan() {
		
	}
	
	public void ketQua() {
		double tich = a * b;
		System.out.println("Tich la: " + tich);
	}
}
