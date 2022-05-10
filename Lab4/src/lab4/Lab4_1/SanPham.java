/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4.Lab4_1;

import java.util.Scanner;

public class SanPham {

    public String tenSP;
    public double donGia;
    public double giamGia;

    void nhap() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap vao ten san pham: ");
        this.tenSP = input.nextLine();
        System.out.print("Nhap vao gia san pham: ");
        this.donGia = input.nextDouble();
        input.nextLine();
    }

    double getThueNhapKhau() {
        double thue = this.donGia * 0.1;
        return thue;
    }

    void xuat() {
        this.giamGia =this.donGia - this.donGia*0.05;
        System.out.printf("Ten san pham: %s\n", this.tenSP);
        System.out.printf("Gia san pham: %.2f\n", this.donGia);
        System.out.printf("Giam gia 5%s: %.2f\n", "%", this.giamGia);
        System.out.printf("Thue nhap khau: %.2f\n", getThueNhapKhau());
    }

}
