/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2;
import java.util.Scanner;
/**
 *
 * @author hoangluc
 */
public class Lab2_1 {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//        ptbac1();
//    }
    public static void ptbac1(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Phuong trinh bac nhat: ax + b");
        
        System.out.print("Nhap he so a: ");
        Double hesoA = scanner.nextDouble();
        System.out.print("Nhap he so b: ");
        Double hesoB = scanner.nextDouble();
        
        System.out.printf("Ta co phuong trinh: %.2fx + %.2f\n", hesoA, hesoB);
        
        if (hesoA == 0){
            System.out.println("Phuong trinh vo nghiem!");
        } else {
            if (hesoB == 0){
                System.out.println("Phuong trinh co vo so nghiem");
            } else {
                double x = -hesoB/hesoA;
                System.out.printf("Phuong trinh co nghiem x = %.2f\n", x);
            }
        }
    }
}

