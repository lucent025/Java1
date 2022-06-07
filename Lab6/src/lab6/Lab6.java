/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6;

import java.util.Scanner;

public class Lab6 {

    public static void main(String[] args) {
        Lab6 bai1 = new Lab6();
        bai1.hoTen();
    }

    void hoTen() {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap vao ho ten: ");
        String hoTen = input.nextLine();

        String ho = hoTen.substring(0, hoTen.indexOf(" "));
        String ten = hoTen.substring(hoTen.lastIndexOf(" "), hoTen.length());

        ho = ho.toUpperCase();
        ten = ten.toUpperCase();

        hoTen = hoTen.replace(hoTen.substring(0, hoTen.indexOf(" ")), ho);
        hoTen = hoTen.replace(hoTen.substring(hoTen.lastIndexOf(" "), hoTen.length()), ten);

        System.out.printf("Ho ten: %s\n", hoTen);

    }
}
