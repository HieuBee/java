package BaiTHend;

public class Chia {
	public double a;
	public double b;
	public Chia(double A, double B) {
		a = A;
		b = B;
	}
	
	public Chia() {
		
	}
	
	public void ketQua() {
		double thuong = a + b;
		System.out.println("Thuong la: " + thuong);
	}
}
