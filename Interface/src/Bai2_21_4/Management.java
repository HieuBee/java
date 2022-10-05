package Bai2_21_4;

public class Management {
	public static void main (String[] args) {
		Rectangle rt = new Rectangle();
		rt.draw();
		rt.getColor("do");
		
		System.out.println("__________");
		
		Circle c = new Circle();
		c.draw();
		c.getColor("xanh");
	}
}
