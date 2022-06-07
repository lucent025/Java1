package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import model.NhanVien;

public class DanhSachNhanVien {

    ArrayList<NhanVien> danhSach = new ArrayList<>();

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

    public void nhapThongTin() {

        do {
            String msnv = validation("Nhap ma so nhan vien: ", "NV[0-9]{3}");
            if (msnv == null || "NV000".equals(msnv)) {
                break;
            }
            String hoTen = validation("Nhap ten nhan vien: ", "([A-Z][a-z]*\\s?){2,}");
            String strluong = validation("Nhap luong nhan vien: ", "[0-9]{1,2}");
            double luong = Double.parseDouble(strluong);

            danhSach.add(new NhanVien(msnv, hoTen, luong));

        } while (true);
    }

    public void xuatThongTin() {
        System.out.println("\n\t\t\tDanh sach nhan vien");
        System.out.printf("ID%-10s Ho Ten%-12s Thu Nhap %-12s Thue Thu Nhap\n", " ", " ", " ", " ");
        for (NhanVien nhanVien : danhSach) {
            System.out.printf("%-10s %-25s %.2f trieu %-10s %.2f\n",
                    nhanVien.getMaNV(),
                    nhanVien.getHoTen(),
                    nhanVien.getLuong(),
                    " ",
                    nhanVien.thueThuNhap());
        }
    }

    public void searchByID() {

        String search = validation("Nhap ma nhan vien can tim: ", "NV[0-9]{3}");
        for (NhanVien nhanVien : danhSach) {
            if (nhanVien.getMaNV().equalsIgnoreCase(search)) {
                System.out.printf("%-10s %-25s %.2f trieu %-10s %.2f\n",
                        nhanVien.getMaNV(),
                        nhanVien.getHoTen(),
                        nhanVien.getLuong(),
                        " ",
                        nhanVien.thueThuNhap());
            }
        }
    }

    public void sortByIDdecrease() {
        Collections.sort(danhSach, giamDanTheoMa);
    }

    public void sortByIDincrease() {
        Collections.sort(danhSach, tangDanTheoMa);
    }

    static Comparator<NhanVien> giamDanTheoMa = new Comparator<NhanVien>() {
        @Override
        public int compare(NhanVien o1, NhanVien o2) {
            return o2.getMaNV().compareTo(o1.getMaNV());
        }
    };

    static Comparator<NhanVien> tangDanTheoMa = new Comparator<NhanVien>() {
        @Override
        public int compare(NhanVien o1, NhanVien o2) {
            return o1.getMaNV().compareTo(o2.getMaNV());
        }
    };

    public void deleteByID() {

        String delete = validation("Nhap ma nhan vien can xoa: ", "NV[0-9]{3}");
        NhanVien xoaNv = null;
        for (NhanVien nhanVien : danhSach) {
            if (nhanVien.getMaNV().equalsIgnoreCase(delete)) {
                xoaNv = nhanVien;
                danhSach.remove(xoaNv);
                break;
            } else if (!nhanVien.getMaNV().equalsIgnoreCase(delete) && (danhSach.indexOf(nhanVien) == danhSach.size())) {
                System.out.println("Khong tim thay nv can xoa!");
            }
        }
    }
}
