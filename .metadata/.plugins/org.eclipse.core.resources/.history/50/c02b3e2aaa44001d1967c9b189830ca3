package VD;

import java.util.Scanner;

public class Management {
	public static void main(String[]args) {
		QuangLyDanhSachNhanVien qlnv = new QuangLyDanhSachNhanVien();
		QuangLyDanhSachTruongDonVi qltdv = new QuangLyDanhSachTruongDonVi();
		int chon = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("");
			System.out.println("1. Them nhan vien");
			System.out.println("2. Them truong don vi");
			System.out.println("3. Hien thi nhan vien");
			System.out.println("4. Hien thi truong don vi");
			System.out.println("5. So nhan vien tren 30 tuoi");
			System.out.println("6. Ban muon xoa truong phong cuoi danh sach?");
			System.out.println("7. Sap xep nhan vien theo danh sach tang dan cua tuoi");
			System.out.println("----------------");
			System.out.println("Chon chuc nang");
			chon = sc.nextInt(); 
			switch (chon) {
				case 1: {
					int kt = 0;
					do {
						NhanVien nv = new NhanVien();
						nv.nhap();
						qlnv.themNhanVien(nv);
						System.out.println("Ban co muon nhap tiep khong? (Bam 0 de dung)");
						kt = sc.nextInt();
					}while(kt != 0);
					break;
				}
				case 2: {
					int kt = 0;
					do {
						TruongDonVi tdv = new TruongDonVi();
						tdv.nhap();
						qltdv.themTruongDonVi(tdv);
						System.out.println("Ban co muon nhap tiep khong? (Bam 0 de dung)");
						kt = sc.nextInt();
					}while(kt != 0);
					break;
				}
				case 3: {
					qlnv.hienthiNhanVien();
					break;
				}
				case 4: {
					qltdv.hienthiTruongDonVi();
					break;
				}
				case 5: {
					qlnv.demNhanVienTren30Tuoi();
					break;
				}
				case 6: {
					qltdv.xoaTruongPhongCuoiDanhSach();
					break;
				}
			}
		}while (chon != 0);
	}
}
