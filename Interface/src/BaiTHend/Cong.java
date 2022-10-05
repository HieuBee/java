package BaiTHend;

public class Cong implements ITinhToan{
	public double a;
	public double b;
	public Cong(double A, double B) {
		a = A;
		b = B;
	}
	
	public Cong() {
		
	}
	
	public void ketQua() {
		double tong = a + b;
		System.out.println("Tong la: " + tong);
	}
}
