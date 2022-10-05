package BaiTHend;

public class Tru implements ITinhToan{
	public double a;
	public double b;
	public Tru(double A, double B) {
		a = A;
		b = B;
	}
	
	public Tru() {
		
	}
	
	public void ketQua() {
		double hieu = a - b;
		System.out.println("Hieu la: " + hieu);
	}

}
