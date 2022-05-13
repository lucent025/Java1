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
//        tiendien();
//    }
    public static void tiendien(){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap so dien su dung: ");
        Double soDien = scanner.nextDouble();
        
        int tienDien;
        if (soDien > 0 && soDien <= 50){
            tienDien = (int) (soDien*1000);
            System.out.printf("So tien phai tra la: %d VND\n", tienDien);
        } else if (soDien > 50){
            tienDien = (int) ((soDien-50)*1200) + 50*1000;
            System.out.printf("So tien phai tra la: %d VND\n", tienDien);
        }
    }
}
