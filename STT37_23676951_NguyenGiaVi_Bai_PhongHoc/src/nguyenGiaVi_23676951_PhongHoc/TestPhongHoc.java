package nguyenGiaVi_23676951_PhongHoc;

import java.util.List;

public class TestPhongHoc {
	public static void main(String[] args) {
		ListPhongHoc ph = new ListPhongHoc();
		
		ph.themPhong(new PhongLT("A01", "Day A", 100, 30, true));
		ph.themPhong(new PhongMT("H04", "Day H", 90, 25, 60));
		ph.themPhong(new PhongMT("H07", "Day H", 120, 40, 70));
		ph.themPhong(new PhongTN("B02", "Day B", 80, 35, "Hoa hoc", 40, true));
		
		
		
		System.out.println("Danh sach phong hoc:");
		System.out.println(ph);
		
		String mp = "A01";
		System.out.println("Phong hoc voi ma: " + mp);
		System.out.println(ph.timPhong(mp));
		
		List<PhongHoc> pDC = ph.danhSachDC();
		System.out.println("Danh sach phong dat chuan:");
		for (PhongHoc p : pDC) {
			System.out.println(p);
		}
		
		ph.sapXepTheoDayNha();
		System.out.println("Danh sach phong hoc theo day nha:");
		System.out.println(ph);
		
		ph.sapXepTheoDienTich();
		System.out.println("Danh sach phong hoc theo dien tich:");
		System.out.println(ph);
		
		ph.sapXepTheoSoBongDen();
		System.out.println("Danh sach phong hoc theo so bong den:");
		System.out.println(ph);
		
		ph.capNhatSoMayTinh("H07", 80);
		System.out.println("Danh sach phong hoc sau khi cap nhat:");
		System.out.println(ph);
		
		ph.xoaPhong("A01");
		System.out.println("Danh sach phong hoc sau khi xoa phong:");
		System.out.println(ph);
		
		System.out.println("Tong so phong hoc: " + ph.tongSoPhong());
		
		List<PhongMT> p60 = ph.dsPhongMTCo60May();
		System.out.println("Danh sach phong may tinh co 60 may: ");
		for (PhongMT p : p60) {
			System.out.println(p);
		}
	}

}
