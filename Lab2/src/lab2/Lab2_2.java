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
public class Lab2_2 {
    public static void main(String[] args){
        ptbac2();
    }
    
    public static void ptbac2(){
                Scanner scanner = new Scanner(System.in);
        Double x,x1,x2;
        
        System.out.print("Phuong trinh bac 2: ax\u00B2 + bx +c\n");
        System.out.print("Nhap he so a: ");
        Double hesoA = scanner.nextDouble();
        System.out.print("Nhap he so b: ");
        Double hesoB = scanner.nextDouble();
        System.out.print("Nhap he so c: ");
        Double hesoC = scanner.nextDouble();
        System.out.printf("Ta co phuong trinh: %.2fx\u00B2 + %.2fx +%.2f\n", 
                hesoA, hesoB, hesoC);
       
        if (hesoA == 0){
            x = -((hesoC)/hesoA);
            System.out.printf("Phuong trinh co nghiem x = %.2f",x);
        } else if (hesoA != 0) {
            Double delta = Math.pow(hesoB, 2) - 4*hesoA*hesoC;
            if (delta < 0){
                System.out.print("Phuong trinh vo nghiem!\n");
            } else if (delta == 0) {
                x = (-hesoB) / (2*hesoA);
                System.out.printf("Phuong trinh co ngiem kep x = %.2f\n", x);
            } else if (delta > 0) {
                x1 = (-hesoB + Math.sqrt(delta)) / (2*hesoA);
                x2 = (-hesoB - Math.sqrt(delta)) / (2*hesoA);
                System.out.printf("Phuong trinh co 2 nghiem phan biet:\n"
                        + "X\u2081 = %.2f\nX\u2082 = %.2f\n", x1,x2);
            }
        }
    }
}
