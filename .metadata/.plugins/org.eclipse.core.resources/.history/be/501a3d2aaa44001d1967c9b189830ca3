package VD;

import java.util.ArrayList;

public class QuangLyDanhSachNhanVien {
	private ArrayList<NhanVien> listNhanVien;
	
	public QuangLyDanhSachNhanVien() {
		listNhanVien = new ArrayList<>();
	}
	
	public QuangLyDanhSachNhanVien(ArrayList<NhanVien> listNhanVien) {
		this.listNhanVien = listNhanVien;
	}
	
/*--------------------------------------------------------------------------*/
	
	public void themNhanVien(NhanVien nv) {
		listNhanVien.add(nv);
	}
	
/*--------------------------------------------------------------------------*/

	public void hienthiNhanVien() {
		for(NhanVien nv : listNhanVien) {
			nv.xuat();
			System.out.println("----------------");
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
