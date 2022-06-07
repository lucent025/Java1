package bai5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai5 {

    public static void main(String[] args) {
        
        DanhSachSanPham ds = new DanhSachSanPham();
        ds.menu();
//        danhSach();
//        soThuc();
    }

//      Bai1
//    public static void soThuc() {
//        Scanner scanner = new Scanner(System.in);
//        ArrayList<Double> mangSoThuc = new ArrayList<>();
//
//        System.out.println("Nhap vao so luong phan tu: ");
//        int soLuong = scanner.nextInt();
//        int i = 0;
//        do {
//            System.out.printf("Nhap vao phan tu thu %d: ", i);
//            double phanTu = scanner.nextDouble();
//
//            mangSoThuc.add(phanTu);
//            i++;
//        } while (i < soLuong);
//
//        System.out.println(mangSoThuc);
//
//        double tong = 0;
//        for (Double x : mangSoThuc) {
//            tong += x;
//        }
//        System.out.println(tong);
//    }
    
//      Bai2
//    public static void danhSach() {
//        Scanner scanner = new Scanner(System.in);
//        ArrayList<String> mangHoTen = new ArrayList<>();
//
//        //nhap
//        do {
//            System.out.print("Nhap ho ten: ");
//            String hoTen = scanner.nextLine();
//
//            if (hoTen.equalsIgnoreCase("dung nhap")) {
//                break;
//            }
//
//            mangHoTen.add(hoTen);
//        } while (true);
//
//        //xuat
//        System.out.println("Xuat: " + mangHoTen);
//
//        //xuat danh sach ngau nhien
//        Collections.shuffle(mangHoTen);
//        System.out.println("Xuat ngau nhien: " + mangHoTen);
//
//        //xep giam dan
//        Collections.sort(mangHoTen);
//        Collections.reverse(mangHoTen);
//        System.out.println("Xep giam dan: " + mangHoTen);
//
//        //Tim va xoa
//        System.out.print("Nhap ten can tim va xoa: ");
//        String find = scanner.nextLine();
//        for (String x : mangHoTen) {
//            if (find.equals(x)) {
//                mangHoTen.remove(mangHoTen.indexOf(x));
//                break;
//            }
//        }
//        System.out.println("Mang sau khi xoa: " + mangHoTen);
//    }
    
    
}
