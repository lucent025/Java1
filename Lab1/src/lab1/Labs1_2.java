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
public class Labs1_2 {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap chieu dai: ");
        Double dai = scanner.nextDouble();
        System.out.print("Nhap chieu rong: ");
        Double rong = scanner.nextDouble();
        
        Double chuvi, dientich, canhnho;
        chuvi = (dai+rong)*2;
        dientich = dai*rong;
        canhnho = Math.min(dai, rong);
        
        System.out.printf("Chu Vi: %.2f\nDien Tich: %.2f\nCanh Nho: %.2f\n", chuvi,dientich,canhnho);
    }
}
