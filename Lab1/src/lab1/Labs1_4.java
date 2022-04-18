/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;
import java.util.Scanner;
/**
 *
 * @author hoangluc
 */
public class Labs1_4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Phuong trinh bac 2: ax\u00B2 + bx + c");
        System.out.print("Nhap he so a: ");
        int hesoA = scanner.nextInt();
        System.out.print("Nhap he so b: ");
        int hesoB = scanner.nextInt();
        System.out.print("Nhap he so c: ");
        int hesoC = scanner.nextInt();
        System.out.printf("Ta co phuong trinh: %dx\u00B2 + %dx + %d\n",hesoA,hesoB,hesoC);
        
        double delta, candelta;
        delta = (Math.pow(hesoB,2) - 4*hesoA*hesoC);
        if (delta > 0){
            candelta = Math.sqrt(delta);
            System.out.printf("Delta: %.2f\nCan Delta: %.2f\n", delta, candelta);
        } else {
            System.out.printf("Delta: %.2f\nKhong co Can Delta vi Delta < 0\n", delta);
        }
    }
}
