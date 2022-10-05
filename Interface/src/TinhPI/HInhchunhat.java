package TinhPI;

public class HInhchunhat implements ITinh{
	public double d;
	public double r;
	
	public HInhchunhat(double dai, double rong) {
		d = dai;
		r = rong;
	}
	
	public HInhchunhat() {
		
	}
	
	public double dienTich() {
		double S = d * r;
		System.out.println("Dien tich hinh chu nhat la: " + S);
		return S;
	}
	
	public double chuVi() {
		double C = ( d + r ) * 2;
		System.out.println("Chu vi hinh chu nhat la: " + C);
		return C;
	}
}
