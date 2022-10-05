package baitap1;

import java.util.ArrayList;

public class QuanLyDanhSachNhanVien {
	private ArrayList<NhanVien> listNhanVien;

	public QuanLyDanhSachNhanVien() {
		listNhanVien = new ArrayList<>();
	}

	public QuanLyDanhSachNhanVien(ArrayList<NhanVien> listNhanVien) {
		this.listNhanVien = listNhanVien;
	}

/*--------------------------------------------------------------------------*/

	public void themNhanVien(NhanVien nv) {
		listNhanVien.add(nv);
	}
	
/*--------------------------------------------------------------------------*/
	
	public void hienThiNhanVien() {
		for (NhanVien nv : listNhanVien) {
			nv.hienThi();
			System.out.println("");
		}
	}

/*--------------------------------------------------------------------------*/

	public void demNhanVienTren30Tuoi() {
		int dem = 0;
		for (NhanVien nv : listNhanVien) {
			if (nv.getTuoi() > 30)
				dem++;
		}
		System.out.println("Co tat ca " + dem + " nhan vien co tuoi tren 30");
	}

}
