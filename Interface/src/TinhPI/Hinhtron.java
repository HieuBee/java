package TinhPI;

public class Hinhtron implements ITinh {
	public double r;
	public Hinhtron() {
		
	}

	public Hinhtron(double bankinh) {
		r = bankinh;
	}
	
	public double chuVi() {
		double C = 2 * PI * r;
		System.out.println("Chu vi hinh tron la: " + C);
		return C;
	}
	
	public double dienTich() {
		double S = PI * r * r;
		System.out.println("Dien tich  hinh tron la: " + S);
		return S;
	}
}
