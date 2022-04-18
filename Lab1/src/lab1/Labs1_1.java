/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1;
import java.util.Scanner;

/**
 *
 * @author hoangluc
 */
public class Labs1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Nhap ho ten: ");
        Scanner scanner = new Scanner(System.in);
        String HoTen = scanner.nextLine();
        System.out.print("Nhap diem trung binh: ");
        Double DiemTB = scanner.nextDouble();
        System.out.printf("%s %.2f Diem \n", HoTen, DiemTB);
    }
    
}
