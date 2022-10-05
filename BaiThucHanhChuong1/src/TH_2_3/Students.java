package TH_2_3;

import java.util.Scanner;

public class Students {
	private int masinhvien;
	private int diemtrungbinh;
	
	public Students() {
		
	}
	
	public Students(int dtb, int msv) {
		this.diemtrungbinh = dtb;
		this.masinhvien = msv;
	}
	public void setDiemtrungbinh(int dtb) {
		this.diemtrungbinh = dtb;
	}
	public int getDiemtrungbinh() {
		return diemtrungbinh;
	}
	public void setMasinhvien(int msv) {
		this.masinhvien = msv;
	}
	public int getMasinhvien() {
		return masinhvien;
	}
	
	public int Kiemtra() {
		if(diemtrungbinh >= 8) {
			System.out.println("Co hoc bong");
		}else{
			System.out.println("Ko co hoc bong");
		}
		return masinhvien;
	}
	
	public void nhap1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien: ") ; 
        masinhvien=sc.nextInt() ;
        System.out.println("Nhap ma diem trung binh: ") ; 
        diemtrungbinh=sc.nextInt() ;
    }
	public void xuat() {
		System.out.println(Kiemtra());
        System.out.println("__________________________________");
	}
}
