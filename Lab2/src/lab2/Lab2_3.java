/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

import java.util.Scanner;

/**
 *
 * @author hoangluc
 */
public class Lab2_3 {
//    public static void main(String[] args){
//        tienTaxi();
//    }

    void tienTaxi() {

        Scanner scanner = new Scanner(System.in);
        int tienTaxi, km;

        System.out.print("Nhap vao so km: ");
        km = scanner.nextInt();

        if (km < 10) {
            tienTaxi = 15000 * km;
            System.out.printf("So tien phai tra la %d VND\n", tienTaxi);
        } else if (km >= 10 && km < 30) {
            tienTaxi = (15000 * 10) + (km - 10) * 13000;
            System.out.printf("So tien phai tra la %d VND\n", tienTaxi);
        } else if (km >= 30) {
            tienTaxi = (15000 * 10) + (13000 * 20) + (km - 30) * 10000;
            System.out.printf("So tien phai tra la %d VND\n", tienTaxi);
        }

//        
//        System.out.print("Nhap so dien su dung: ");
//        Double soDien = scanner.nextDouble();
//        
//        int tienDien;
//        if (soDien > 0 && soDien <= 50){
//            tienDien = (int) (soDien*1000);
//            System.out.printf("So tien phai tra la: %d VND\n", tienDien);
//        } else if (soDien > 50){
//            tienDien = (int) ((soDien-50)*1200) + 50*1000;
//            System.out.printf("So tien phai tra la: %d VND\n", tienDien);
//        }
    }
}
