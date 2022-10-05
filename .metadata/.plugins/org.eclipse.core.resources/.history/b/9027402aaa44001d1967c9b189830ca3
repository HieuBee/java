package VD;

import java.util.ArrayList;

public class QuangLyDanhSachTruongDonVi {
	private ArrayList<TruongDonVi> listTruongDonVi;
	
	public QuangLyDanhSachTruongDonVi() {
		listTruongDonVi = new ArrayList<>();
	}
	
	public QuangLyDanhSachTruongDonVi(ArrayList<TruongDonVi> listTruongDonVi) {
		this.listTruongDonVi = listTruongDonVi;
	}
	
/*--------------------------------------------------------------------------*/
	
	public void themTruongDonVi(TruongDonVi tdv) {
		listTruongDonVi.add(tdv);
	}
	
/*--------------------------------------------------------------------------*/
	
	public void hienthiTruongDonVi() {
		for(TruongDonVi tdv : listTruongDonVi) {
			tdv.xuat();
			System.out.println("-------------------");
		}
	}
	
/*--------------------------------------------------------------------------*/	
	
	public void xoaTruongPhongCuoiDanhSach() {
		listTruongDonVi.remove(listTruongDonVi.size() - 1);
	}
}
