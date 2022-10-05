package Buoi5TH1;

public class Management_ChuyenXe {
	public static void main(String arg[]) {
		ChuyenXeNgoaiThanh ngoaithanh1 = new ChuyenXeNgoaiThanh();
		ngoaithanh1.nhap();
		ngoaithanh1.hienthi();
		
		ChuyenXeNgoaiThanh ngoaithanh2 = new ChuyenXeNgoaiThanh();
		ngoaithanh2.nhap(2123, "HueBus", "Hue", 2, 3, 1);
		ngoaithanh2.hienthi();
		
	}
}
