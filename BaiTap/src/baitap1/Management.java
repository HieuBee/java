package baitap1;

import java.util.Scanner;

public class Management {
	public static void main(String[] args) {
		QuanLyDanhSachNhanVien qlnv = new QuanLyDanhSachNhanVien();
		QuanLyDanhSachTruongPhong qltdv = new QuanLyDanhSachTruongPhong();
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
			System.out.print("Chon chuc nang: ");
			chon = sc.nextInt();
			switch (chon) {
				case 1 : {
					int kt = 0;
					do {
						try {
							NhanVien nv= new NhanVien();
							System.out.println("");
							nv.nhap();
							qlnv.themNhanVien(nv);
							System.out.println("");
							System.out.println("Ban co muon nhap tiep khong? (Bam 0 de dung)");
							kt = sc.nextInt();
						}
						catch (Exception e) {
							System.out.println(e.getMessage());
						}
					} while(kt != 0);
					break;
				}
				
				case 2 : {
					int kt = 0;
					do {
						try {
							TruongDonVi tdv = new TruongDonVi();
							System.out.println("");
							tdv.nhap();
							qltdv.themTruongDonVi(tdv);
							System.out.println("");
							System.out.println("Ban co muon nhap tiep khong? (Bam 0 de dung)");
							kt = sc.nextInt();
						}
						catch (Exception e) {
							System.out.println(e.getMessage());
						}
					} while(kt != 0);
					break;
				}
				
				case 3 : {
					System.out.println("");
					qlnv.hienThiNhanVien();
					break;
				}
				
				case 4 : {
					System.out.println("");
					qltdv.hienThiTruongDonVi();
					break;
				}
				
				case 5 : {
					System.out.println("");
					qlnv.demNhanVienTren30Tuoi();
					break;
				}
				case 6 : {
					System.out.println("");
					qltdv.xoaTruongPhongCuoiDanhSach();
					System.out.println("Nhap 4 de kiem tra lai ket qua");
				}
			}
		} while (chon != 0);
	}
}
