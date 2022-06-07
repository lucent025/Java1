package assignment;

import assignment.model.NhanVienTiepThi;
import assignment.model.TruongPhong;
import assignment.model.NhanVien;
import java.util.ArrayList;
import java.util.Scanner;

public class DsNhanVien {

    private ArrayList<NhanVien> danhSach = new ArrayList<>();

    public void nhapThongTin() {

        do {
            String msnv = validation("Nhap ma so nhan vien: ", "NV[0-9]{3}");
            //huy nhap
            if (msnv == null || "NV000".equals(msnv)) {
                break;
            }
            String hoTen = validation("Nhap ten nhan vien: ", "([A-Z][a-z]*\\s?){2,}");
            String chucVu = validation("Nhap chuc vu nhan vien: ", "([A-Z][a-z]*\\s?){2,}");

            if (chucVu.equalsIgnoreCase("Hanh chinh")) {

                String strluong = validation("Nhap luong nhan vien: ", "[0-9]{1,2}");
                double luong = Double.parseDouble(strluong);

                NhanVien hanhChinh = new NhanVien(msnv, hoTen, chucVu, luong);
                danhSach.add(hanhChinh);

            } else if (chucVu.equalsIgnoreCase("Tiep thi")) {

                String strluong = validation("Nhap luong nhan vien: ", "[0-9]{1,2}");
                double luong = Double.parseDouble(strluong);
                String strDoanhSo = validation("Nhap doanh so: ", "[0-9]{1,2}");
                double doanhSo = Double.parseDouble(strDoanhSo);
                String strHueHong = validation("Nhap hue hong: ", "[0-9]{1,2}");
                double hueHong = Double.parseDouble(strHueHong);

                NhanVien tiepThi = new NhanVienTiepThi(msnv, hoTen, chucVu, luong, doanhSo, hueHong);
                danhSach.add(tiepThi);

            } else if (chucVu.equalsIgnoreCase("Truong phong")) {

                String strluong = validation("Nhap luong nhan vien: ", "[0-9]{1,2}");
                double luong = Double.parseDouble(strluong);
                String strTrachNhiem = validation("Nhap trach nhiem: ", "[0-9]{1,2}");
                double trachNhiem = Double.parseDouble(strTrachNhiem);

                NhanVien truongPhong = new TruongPhong(msnv, hoTen, chucVu, luong, trachNhiem);
                danhSach.add(truongPhong);

            } else {
                System.out.println("Hay nhap lai thong tin");
            }
        } while (true);
    }

    public String validation(String command, String pattern) {
        Scanner input = new Scanner(System.in);
        String str = null;

        do {
            System.out.print(command);
            str = input.nextLine();
            if (str.matches(pattern)) {
                break;
            } else {
                System.out.println("Nhap sai, nhap lai");
            }
        } while (true);

        return str;
    }

    public void xuatThongTin() {
        System.out.println("\n\t\t\tDanh sach nhan vien");
        System.out.printf("ID%-10s Ho Ten%-18s Chuc Vu%-12s Thu Nhap\n", " ", " ", " ");
        for (NhanVien nhanVien : danhSach) {
            System.out.printf("%-10s %-25s %-20s %.2f trieu\n",
                    nhanVien.getMaSoNV(),
                    nhanVien.getTenNV(),
                    nhanVien.getChucVu(),
                    nhanVien.getThuNhap());
        }
    }

    public void searchByID() {

        String search = validation("Nhap ma nhan vien can tim: ", "NV[0-9]{3}");
        for (NhanVien nhanVien : danhSach) {
            if (nhanVien.getMaSoNV().equalsIgnoreCase(search)) {
                System.out.printf("%-10s %-25s %-20s %.2f trieu\n",
                        nhanVien.getMaSoNV(),
                        nhanVien.getTenNV(),
                        nhanVien.getChucVu(),
                        nhanVien.getThuNhap());
                break;
            }
        }
    }

    public void deleteByID() {

        String delete = validation("Nhap ma nhan vien can xoa: ", "NV[0-9]{3}");
        NhanVien xoaNv = null;
        for (NhanVien nhanVien : danhSach) {
            if (nhanVien.getMaSoNV().equalsIgnoreCase(delete)) {
                xoaNv = nhanVien;
                danhSach.remove(xoaNv);
                break;
            }
        }
    }

    public void updateByID() {

        String update = validation("Nhap ma nhan vien can cap nhat: ", "NV[0-9]{3}");

        for (NhanVien nhanVien : danhSach) {
            if (nhanVien.getMaSoNV().equalsIgnoreCase(update)) {
                System.out.println("1. Thay doi ho ten.");
                System.out.println("2. Thay doi chuc vu.");
                System.out.println("3. Thay doi luong.");
                System.out.println("0. Huy thay doi.");
                String opt = validation("Nhap thong tin can thay doi:", "[0-3]{1}");

                switch (opt) {
                    case "1" -> {
                        //cap nhat ten
                        String newName = validation("Nhap ten moi: ", "([A-Z][a-z]*\\s?){2,}");
                        nhanVien.setTenNV(newName);
                        break;
                    }
                    case "2" -> {
                        //cap nhat chuc vu
                        String newRole = validation("Nhap chuc vu moi: ", "([A-Z][a-z]*\\s?){2,}");

                        if (newRole.equalsIgnoreCase("Tiep Thi")) {
                            String strluong = validation("Nhap luong nhan vien: ", "[0-9]{1,2}");
                            double luong = Double.parseDouble(strluong);
                            String strDoanhSo = validation("Nhap doanh so: ", "[0-9]{1,2}");
                            double doanhSo = Double.parseDouble(strDoanhSo);
                            String strHueHong = validation("Nhap hue hong: ", "[0-9]{1,2}");
                            double hueHong = Double.parseDouble(strHueHong);

                            NhanVien tiepThi = new NhanVienTiepThi(nhanVien.getMaSoNV(),
                                    nhanVien.getTenNV(),
                                    newRole, luong, doanhSo, hueHong);
                            //xoa du lieu cu & truyen du lieu moi
                            NhanVien xoaNv = nhanVien;
                            danhSach.add(tiepThi);
                            danhSach.remove(xoaNv);
                        } else if (newRole.equalsIgnoreCase("truong phong")) {
                            String strluong = validation("Nhap luong nhan vien: ", "[0-9]{1,2}");
                            double luong = Double.parseDouble(strluong);
                            String strTrachNhiem = validation("Nhap trach nhiem: ", "[0-9]{1,2}");
                            double trachNhiem = Double.parseDouble(strTrachNhiem);

                            NhanVien truongPhong = new TruongPhong(nhanVien.getMaSoNV(),
                                    nhanVien.getTenNV(),
                                    newRole, luong, trachNhiem);
                            //xoa du lieu cu & truyen du lieu moi
                            NhanVien xoaNv = nhanVien;
                            danhSach.add(truongPhong);
                            danhSach.remove(xoaNv);
                        } else if (newRole.equalsIgnoreCase("hanh chinh")) {
                            String strluong = validation("Nhap luong nhan vien: ", "[0-9]{1,2}");
                            double luong = Double.parseDouble(strluong);

                            NhanVien hanhChinh = new NhanVien(nhanVien.getMaSoNV(),
                                    nhanVien.getTenNV(),
                                    newRole, luong);
                            //xoa du lieu cu & truyen du lieu moi
                            NhanVien xoaNv = nhanVien;
                            danhSach.add(hanhChinh);
                            danhSach.remove(xoaNv);
                        }
                    }
                    case "3" -> {
                        if (nhanVien.getChucVu().equalsIgnoreCase("Tiep thi")) {
                            String strNewLuong = validation("Nhap luong nhan vien: ", "[0-9]{1,2}");
                            double luong = Double.parseDouble(strNewLuong);
                            String strNewDoanhSo = validation("Nhap doanh so: ", "[0-9]{1,2}");
                            double doanhSo = Double.parseDouble(strNewDoanhSo);
                            String strNewHueHong = validation("Nhap hue hong: ", "[0-9]{1,2}");
                            double hueHong = Double.parseDouble(strNewHueHong);

                            NhanVienTiepThi luongTiepThi = new NhanVienTiepThi();
                            luongTiepThi.setLuongNV(luong);
                            luongTiepThi.setDoanhSo(doanhSo);
                            luongTiepThi.setHueHong(hueHong);
                        } else if (nhanVien.getChucVu().equalsIgnoreCase("truong phong")) {
                            String strNewLuong = validation("Nhap luong nhan vien: ", "[0-9]{1,2}");
                            double luong = Double.parseDouble(strNewLuong);
                            String strNewTrachNhiem = validation("Nhap trach nhiem: ", "[0-9]{1,2}");
                            double trachNhiem = Double.parseDouble(strNewTrachNhiem);

                            TruongPhong luongTruongPhong = new TruongPhong();
                            luongTruongPhong.setLuongNV(luong);
                            luongTruongPhong.setTrachNhiem(trachNhiem);
                        } else if (nhanVien.getChucVu().equalsIgnoreCase("hanh chinh")) {
                            String strluong = validation("Nhap luong nhan vien: ", "[0-9]{1,2}");
                            double luong = Double.parseDouble(strluong);

                            NhanVien luongNhanVien = new NhanVien();
                            luongNhanVien.setLuongNV(luong);
                        }
                    }
                }
            }
        }
    }

    public void searchBySalary() {

        System.out.println("1. Luong trong khoang duoi.");
        System.out.println("2. Luong trong khoang tren.");
        System.out.println("3. Luong trong khoang tu X -> Y.");
        System.out.println("0. Thoat.");
        String options = validation("Nhap lua chon: ", "[0-3]{1}");
        switch (options) {
            case "1" -> {
                String strSearchLuong = validation("Nhap luong nhan vien: ", "[0-9]{1,2}");
                double searchLuong = Double.parseDouble(strSearchLuong);
                System.out.printf("ID%-10s Ho Ten%-18s Chuc Vu%-12s Thu Nhap\n", " ", " ", " ");
                for (NhanVien nhanVien : danhSach) {
                    if (nhanVien.getLuongNV() < searchLuong) {
                        System.out.printf("%-10s %-25s %-20s %.2f trieu\n",
                                nhanVien.getMaSoNV(),
                                nhanVien.getTenNV(),
                                nhanVien.getChucVu(),
                                nhanVien.getThuNhap());
                    } else if (!(nhanVien.getLuongNV() < searchLuong) && danhSach.indexOf(nhanVien) == danhSach.size() - 1) {
                        System.out.printf("Khong co ai duoi muc luong %.2f trieu\n", searchLuong);
                    }
                }
            }

            case "2" -> {
                String strSearchLuong = validation("Nhap luong nhan vien: ", "[0-9]{1,2}");
                double searchLuong = Double.parseDouble(strSearchLuong);
                System.out.printf("ID%-10s Ho Ten%-18s Chuc Vu%-12s Thu Nhap\n", " ", " ", " ");
                for (NhanVien nhanVien : danhSach) {
                    if (nhanVien.getLuongNV() > searchLuong) {
                        System.out.printf("%-10s %-25s %-20s %.2f trieu\n",
                                nhanVien.getMaSoNV(),
                                nhanVien.getTenNV(),
                                nhanVien.getChucVu(),
                                nhanVien.getThuNhap());
                    } else if (!(nhanVien.getLuongNV() > searchLuong) && danhSach.indexOf(nhanVien) == danhSach.size() - 1) {
                        System.out.printf("Khong co ai tren muc luong %.2f trieu\n", searchLuong);
                    }
                }
            }

            case "3" -> {
                String strSearchLuongX = validation("Nhap luong nhan vien x: ", "[0-9]{1,2}");
                String strSearchLuongY = validation("Nhap luong nhan vien y: ", "[0-9]{1,2}");
                double searchLuongX = Double.parseDouble(strSearchLuongX);
                double searchLuongY = Double.parseDouble(strSearchLuongY);
                System.out.printf("ID%-10s Ho Ten%-18s Chuc Vu%-12s Thu Nhap\n", " ", " ", " ");
                for (NhanVien nhanVien : danhSach) {
                    if (nhanVien.getLuongNV() > searchLuongX && nhanVien.getLuongNV() < searchLuongY) {
                        System.out.printf("%-10s %-25s %-20s %.2f trieu\n",
                                nhanVien.getMaSoNV(),
                                nhanVien.getTenNV(),
                                nhanVien.getChucVu(),
                                nhanVien.getThuNhap());
                    } else if (!(nhanVien.getLuongNV() > searchLuongX && nhanVien.getLuongNV() < searchLuongY)
                            && danhSach.indexOf(nhanVien) == danhSach.size() - 1) {
                        System.out.printf("Khong co ai co muc luong trong khoang tu %.2f trieu den %.2f trieu\n", searchLuongX,
                                searchLuongY);
                    }
                }
            }
            case "0" -> {
                break;
            }
        }
    }
}
