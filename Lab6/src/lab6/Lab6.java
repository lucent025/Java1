/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab6 {

    public static void main(String[] args) {
        Lab6 ds = new Lab6();
//        bai1.hoTen();
        ds.nhapThongTinSV();
        ds.xuatThongTinSv();
    }
//Bai1

    void hoTen() {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap vao ho ten: ");
        String hoTen = input.nextLine();

        String ho = hoTen.substring(0, hoTen.indexOf(" "));
        String ten = hoTen.substring(hoTen.lastIndexOf(" "), hoTen.length());

        ho = ho.toUpperCase();
        ten = ten.toUpperCase();

        hoTen = hoTen.replace(hoTen.substring(0, hoTen.indexOf(" ")), ho);
        hoTen = hoTen.replace(hoTen.substring(hoTen.lastIndexOf(" "), hoTen.length()), ten);

        System.out.printf("Ho ten: %s\n", hoTen);

    }

    //Bai2
    ArrayList<SanPham> sp = new ArrayList<>();

    public void nhap() {
        do {
            String tenSp = validation("Nhap ten san pham: ", "[a-zA-Z ]+");
            if (tenSp == null || "stop".equalsIgnoreCase(tenSp)) {
                break;
            }
            String strgiaSp = validation("Nhap gia san pham: ", "[0-9]{1,2}");
            double giaSp = Double.parseDouble(strgiaSp);
            String hang = validation("Nhap hang san pham: ", "[a-zA-Z]+");
            SanPham sanPham = new SanPham(tenSp, giaSp, hang);

            sp.add(sanPham);

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
        for (SanPham sanPham : sp) {
            if (sanPham.getHang().equalsIgnoreCase("Nokia")) {
                System.out.printf("%-10s %.2f %s\n",
                        sanPham.getTenSp(),
                        sanPham.getGiaSp(),
                        sanPham.getHang());
            }
        }
    }

    //bai3
    ArrayList<SinhVien> sinhVien = new ArrayList<>();

    public void nhapThongTinSV() {
        do {
            String tenSv = validation("Nhap ten sinh vien: ", "([A-Z][a-z]*\\s?){2,}");
            if (tenSv == null || "stop".equalsIgnoreCase(tenSv)) {
                break;
            }
            String Email = validation("Nhap email: ", "(\\w+)@(\\w+)(\\.\\w){1,2}");
            String phone = validation("Nhap so dien thoai: ", "0\\d{9,10}");
            String cmnd = validation("Nhap chung minh nhan dan: ", "[0-9]{9}");
            SinhVien sv = new SinhVien(tenSv, Email, phone, cmnd);
            
            sinhVien.add(sv);

        } while (true);
    }
    public void xuatThongTinSv() {
        for (SinhVien sinhVien : sinhVien) {
            System.out.printf("%s %s %s %s\n",
                        sinhVien.getTenSv(),
                        sinhVien.getPhone(),
                        sinhVien.getEmail(),
                        sinhVien.getCmnd());
        }
    }
}
