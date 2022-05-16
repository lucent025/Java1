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
//        datetime();
//    }

    static boolean thang31(int a) {
        int[] thang = {1, 3, 5, 7, 8, 10, 12};
        boolean state = false;
        for (int i : thang) {
            if (i == a) {
                state = true;
                break;
            }

        }
        return state;
    }
    
    static boolean kiemTraNam(int nam) { 
        return (((nam % 4 == 0) && (nam % 100 != 0)) || (nam % 400 == 0)); 
    } 

    void datetime() {

        int ngay = 28, thang, nam;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap vao thang: ");
            thang = sc.nextInt();
            System.out.print("Nhap vao nam: ");
            nam = sc.nextInt();
            if ((thang >= 1 && thang <= 12) && nam > 0) {
                break;
            }
        } while (true);
        if (thang31(thang)) {
            ngay += 3;
            System.out.printf("Thang %d nam %d co %d ngay\n", thang, nam, ngay);
        } else {
            if (thang == 2) {
                if (kiemTraNam(nam)) {
                    ngay += 1;
                    System.out.printf("Thang %d nam %d co %d ngay\n", thang, nam, ngay);
                } else {
                    System.out.printf("Thang %d nam %d co %d ngay\n", thang, nam, ngay);
                }
            } else {
                ngay += 2;
                System.out.printf("Thang %d nam %d co %d ngay\n", thang, nam, ngay);

            }
        }

        //1,3,5,7,8,10,12
//        Scanner scanner = new Scanner(System.in);
//        
//        System.out.println("Phuong trinh bac nhat: ax + b");
//        
//        System.out.print("Nhap he so a: ");
//        Double hesoA = scanner.nextDouble();
//        System.out.print("Nhap he so b: ");
//        Double hesoB = scanner.nextDouble();
//        
//        System.out.printf("Ta co phuong trinh: %.2fx + %.2f\n", hesoA, hesoB);
//        
//        if (hesoA == 0){
//            System.out.println("Phuong trinh vo nghiem!");
//        } else {
//            if (hesoB == 0){
//                System.out.println("Phuong trinh co vo so nghiem");
//            } else {
//                double x = -hesoB/hesoA;
//                System.out.printf("Phuong trinh co nghiem x = %.2f\n", x);
//            }
//        }
    }
}
