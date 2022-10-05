package baitap1;

import java.util.ArrayList;

public class QuanLyDanhSachTruongPhong {
	private ArrayList<TruongDonVi> listTruongDonVi;

	public QuanLyDanhSachTruongPhong() {
		listTruongDonVi = new ArrayList<>();
	}

	public QuanLyDanhSachTruongPhong(ArrayList<TruongDonVi> listTruongDonVi) {
		this.listTruongDonVi = listTruongDonVi;
	}

/*--------------------------------------------------------------------------*/

	public void themTruongDonVi(TruongDonVi tdv) {
		listTruongDonVi.add(tdv);
	}

/*--------------------------------------------------------------------------*/

	public void hienThiTruongDonVi() {
		for (TruongDonVi tdv : listTruongDonVi) {
			tdv.hienThi();
			System.out.println("");
		}
	}

/*--------------------------------------------------------------------------*/

	public void xoaTruongPhongCuoiDanhSach() {
		listTruongDonVi.remove(listTruongDonVi.size() - 1);
	}
}
