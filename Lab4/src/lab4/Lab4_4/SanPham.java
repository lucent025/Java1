/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4.Lab4_4;

import java.util.Scanner;

public class SanPham {
    //Bai1
//    public String tenSP;
//    public double donGia;
//    public double giamGia;
//
//    void nhap() {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Nhap vao ten san pham: ");
//        this.tenSP = input.nextLine();
//        System.out.print("Nhap vao gia san pham: ");
//        this.donGia = input.nextDouble();
//        input.nextLine();
//    }
//
//    double getThueNhapKhau() {
//        double thue = this.donGia * 0.1;
//        return thue;
//    }
//
//    void xuat() {
//        this.giamGia =this.donGia - this.donGia*0.05;
//        System.out.printf("Ten san pham: %s\n", this.tenSP);
//        System.out.printf("Gia san pham: %.2f\n", this.donGia);
//        System.out.printf("Giam gia 5%s: %.2f\n", "%", this.giamGia);
//        System.out.printf("Thue nhap khau: %.2f\n", getThueNhapKhau());
//    }
    //Bai2
//    public String tenSP;
//    public double donGia;
//    public double giamGia;
//
//    void nhap() {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Nhap vao ten san pham: ");
//        this.tenSP = input.nextLine();
//        System.out.print("Nhap vao gia san pham: ");
//        this.donGia = input.nextDouble();
//        input.nextLine();
//    }
//
//    double getThueNhapKhau() {
//        double thue = this.donGia * 0.1;
//        return thue;
//    }
//
//    void xuat() {
//        this.giamGia =this.donGia - this.donGia*0.05;
//        System.out.printf("Ten san pham: %s\n", this.tenSP);
//        System.out.printf("Gia san pham: %.2f\n", this.donGia);
//        System.out.printf("Giam gia 5%s: %.2f\n", "%", this.giamGia);
//        System.out.printf("Thue nhap khau: %.2f\n", getThueNhapKhau());
//    }
    
    //Bai3
//    public String tenSP;
//    public double donGia;
//    public double giamGia;
//    
//    public SanPham(String tenSP, double donGia, double giamGia) {
//        this.tenSP = tenSP;
//        this.donGia = donGia;
//        this.giamGia = giamGia;
//    }
//    
//    public SanPham(String tenSP, double donGia) {
//        this(tenSP,donGia,0);
//    }
//
//    void nhap() {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Nhap vao ten san pham: ");
//        tenSP = input.nextLine();
//        System.out.print("Nhap vao gia san pham: ");
//        donGia = input.nextDouble();
//        input.nextLine();
//    }
//
//    private double getThueNhapKhau() {
//        double thue = donGia * 0.1;
//        return thue;
//    }
//
//    public void xuat() {
//        System.out.printf("Ten san pham: %s\n", tenSP);
//        System.out.printf("Gia san pham: %.2f\n", donGia);
//        System.out.printf("Giam gia : %.2f\n", giamGia);
//        System.out.printf("Thue nhap khau: %.2f\n", getThueNhapKhau());
//    }

    //Bai4
    private String tenSP;
    private double donGia;
    private double giamGia;

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    public SanPham(String tenSP, double donGia, double giamGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPham(String tenSP, double donGia) {
        this(tenSP, donGia, 0);
    }

    void nhap() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap vao ten san pham: ");
        tenSP = input.nextLine();
        System.out.print("Nhap vao gia san pham: ");
        donGia = input.nextDouble();
        input.nextLine();
    }

    private double getThueNhapKhau() {
        double thue = donGia * 0.1;
        return thue;
    }

    public void xuat() {
        System.out.printf("Ten san pham: %s\n", tenSP);
        System.out.printf("Gia san pham: %.2f\n", donGia);
        System.out.printf("Giam gia : %.2f\n", giamGia);
        System.out.printf("Thue nhap khau: %.2f\n", getThueNhapKhau());
    }

}
