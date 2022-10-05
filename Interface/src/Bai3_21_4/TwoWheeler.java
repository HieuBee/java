package Bai3_21_4;

public class TwoWheeler implements IVehicle, IManufatuner{
	public int ID;
	public String Type; 
	
	public TwoWheeler() {
		
	}
	
	public TwoWheeler(int id, String type) {
		ID = id;
		Type = type;
	}

	public void addContact() {
		System.out.println("Them lien he cua ban");
	}

	public void callManufactuner() {
		System.out.println("Goi cho nha san xuat");
	}

	public void makePayment() {
		System.out.println("Thanh toan");
	}

	public void khoidong() {
		System.out.println("Khoi dong xe cua ban");
	}

	public void tangtoc() {
		System.out.println("Xe co the tang toc len 10000000000000000 km/h, voi toc do nay co the dua ban len ban tho 1 cach nhanh chong");
	}

	public void hamphanh() {
		System.out.println("Ham thanh tot");
	}

	public void dungxe() {
		System.out.println("Dung xe");
	}
	
	public void hienthithongsoxe() {
		System.out.println("Xe 10d");
	}
}
