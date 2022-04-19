/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HoangLuc
 */
public class Lab5_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mangList();
    }
    public static void mangList() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> sothuc = new ArrayList<Double>();
        System.out.print("Nhap so: ");
        try {
            while(true){
            double nhapso = scanner.nextDouble();
            sothuc.add(nhapso);
            
            System.out.print("Nhap them (/N)?");
            if(scanner.nextLine().equals("N"));
            }
        } catch(Exception e){
            double sum = 0;
            for(Double x : sothuc){
                System.out.println(x);
                sum += x;
            }
            System.out.printf("Tong la: %.2f\n",sum);
         }        
    }
}
