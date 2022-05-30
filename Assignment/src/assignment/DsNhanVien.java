package assignment;

import assignment.model.NhanVienTiepThi;
import assignment.model.TruongPhong;
import java.util.ArrayList;
import java.util.Scanner;

public class DsNhanVien {

    private ArrayList<NhanVien> danhSach = new ArrayList<>();

    public void nhapThongTin() {

        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Nhap ma so nhan vien: ");
            String msnv = new Scanner(System.in).nextLine();
            if (msnv == null || "".equals(msnv)) {
                break;
            }
            System.out.print("Nhap ten nhan vien: ");
            String hoTen = input.nextLine();
            System.out.print("Nhap chuc vu nhan vien: ");
            String chucVu = input.nextLine();
            if (chucVu.equalsIgnoreCase("Hanh chinh")) {
                System.out.print("Nhap luong nhan vien: ");
                double luong = input.nextDouble();
                NhanVien hanhChinh = new NhanVien(msnv, hoTen, chucVu, luong);
                danhSach.add(hanhChinh);
            } else if (chucVu.equalsIgnoreCase("Tiep thi")) {
                System.out.print("Nhap luong nhan vien: ");
                double luong = input.nextDouble();
                System.out.print("Nhap doanh so: ");
                double doanhSo = input.nextDouble();
                System.out.print("Nhap hue hong: ");
                double hueHong = input.nextDouble();
                NhanVien tiepThi = new NhanVienTiepThi(msnv, hoTen, chucVu, luong, doanhSo, hueHong);
                danhSach.add(tiepThi);
            } else if (chucVu.equalsIgnoreCase("Truong phong")) {
                System.out.print("Nhap luong nhan vien: ");
                double luong = input.nextDouble();
                System.out.print("Nhap luong trach nhiem: ");
                double trachNhiem = input.nextDouble();
                NhanVien truongPhong = new TruongPhong(msnv, hoTen, chucVu, luong, trachNhiem);
                danhSach.add(truongPhong);
            } else {
                System.out.println("Hay nhap lai thong tin");
            }

        } while (true);
    }

    public void xuatThongTin() {
        System.out.println("\nDanh sach nhan vien");
        for (NhanVien nhanVien : danhSach) {
            System.out.printf("%-10s %-25s %-20s %.2f\n", 
                    nhanVien.getMaSoNV(),
                    nhanVien.getTenNV(),
                    nhanVien.getChucVu(),
                    nhanVien.getThuNhap());
        }
    }
}
