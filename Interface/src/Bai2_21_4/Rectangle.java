package Bai2_21_4;

public class Rectangle implements IColor, IShape{

	public void getColor(String mau) {
		System.out.println("Mau" + mau);
	}
	
	public void draw() {
		System.out.println("Hinh chu nhat");
	}
}
