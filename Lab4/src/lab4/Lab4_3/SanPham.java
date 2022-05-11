/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4.Lab4_3;

import java.util.Scanner;

public class SanPham {

    public String tenSP;
    public double donGia;
    public double giamGia;
    
    public SanPham(String tenSP, double donGia, double giamGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }
    
    public SanPham(String tenSP, double donGia) {
        this(tenSP,donGia,0);
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
