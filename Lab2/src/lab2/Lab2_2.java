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
//    public static void main(String[] args){
//        ptbac2();
//    }

    void tamGiac() {

        Scanner sc = new Scanner(System.in);

        
        double canhA, canhB, canhC, chuvi, dientich, p;

        
        System.out.print("Nhap vao canh thu nhat: ");
        canhA = sc.nextDouble();
        System.out.print("Nhap vao canh thu hai: ");
        canhB = sc.nextDouble();
        System.out.print("Nhap vao canh thu ba: ");
        canhC = sc.nextDouble();

        
        if ((canhA + canhB > canhC) && (canhA + canhC > canhB) && (canhB + canhC > canhA)
                && (canhA > 0) && (canhB > 0) && (canhC > 0)) {
            // Kiểm tra điều các tam giác đặc biệt
            if ((canhA == canhB) && (canhB == canhC)) {
                System.out.println("Tam giac deu!");
            } else if ((canhA == canhB) || (canhA == canhC) || (canhB == canhC)) {
                System.out.println("Tam giac can!");
            } else if ((canhA * canhA == canhB * canhB + canhC * canhC)
                    || (canhB * canhB == canhA * canhA + canhC * canhC)
                    || (canhC * canhC == canhA * canhA + canhB * canhB)) {
                System.out.println("Tam giac vuong!");
            } else if (((canhA * canhA + canhB * canhB == canhC * canhC) && (canhA == canhB))
                    || ((canhA * canhA + canhC * canhC == canhB * canhB) && (canhA == canhC))
                    || ((canhB * canhB + canhC * canhC == canhA * canhA) && (canhB == canhC))) {
                System.out.println("Tam giac vuong can!");
            } else {
                System.out.println("Tam giac thuong!");
            }
        } else {
            System.out.println("3 canh cua tam giac khong thoa man dieu kien lap thanh tam giac!");
        }
        
        
        chuvi = (canhA + canhB + canhC);
        p = (canhA + canhB + canhC) / 2;
        dientich = Math.sqrt(p - (p - canhA) * (p - canhB) * (p - canhC));
        System.out.println("Chu vi: " + chuvi);
        System.out.println("Dien tich: " + dientich);

//        Scanner scanner = new Scanner(System.in);
//        Double x, x1, x2;
//
//        System.out.print("Phuong trinh bac 2: ax\u00B2 + bx +c\n");
//        System.out.print("Nhap he so a: ");
//        Double hesoA = scanner.nextDouble();
//        System.out.print("Nhap he so b: ");
//        Double hesoB = scanner.nextDouble();
//        System.out.print("Nhap he so c: ");
//        Double hesoC = scanner.nextDouble();
//        System.out.printf("Ta co phuong trinh: %.2fx\u00B2 + %.2fx +%.2f\n",
//                hesoA, hesoB, hesoC);
//
//        if (hesoA == 0) {
//            x = -((hesoC) / hesoA);
//            System.out.printf("Phuong trinh co nghiem x = %.2f", x);
//        } else if (hesoA != 0) {
//            Double delta = Math.pow(hesoB, 2) - 4 * hesoA * hesoC;
//            if (delta < 0) {
//                System.out.print("Phuong trinh vo nghiem!\n");
//            } else if (delta == 0) {
//                x = (-hesoB) / (2 * hesoA);
//                System.out.printf("Phuong trinh co ngiem kep x = %.2f\n", x);
//            } else if (delta > 0) {
//                x1 = (-hesoB + Math.sqrt(delta)) / (2 * hesoA);
//                x2 = (-hesoB - Math.sqrt(delta)) / (2 * hesoA);
//                System.out.printf("Phuong trinh co 2 nghiem phan biet:\n"
//                        + "X\u2081 = %.2f\nX\u2082 = %.2f\n", x1, x2);
//            }
//        }
    }
}
