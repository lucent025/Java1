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
public class Labs1_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap chieu dai canh: ");
        Double canh = scanner.nextDouble();
        
        canh = Math.pow(canh,3);
        
        System.out.printf("The Tich: %.2f\n", canh);
    }
}
