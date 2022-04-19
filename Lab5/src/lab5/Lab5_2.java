/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Lab5_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        menu();
        
    }
    
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        int luachon = scanner.nextInt();
        switch(luachon){
            case 1:
                nhap();
                menu();
                break;
            case 2:
                xuat();
                menu();
                break;
            case 3:
                sapxep();
                menu();
                break;
            case 4:
                ngaunhien();
                menu();
                break;
            default:
                menu();
        }
    }
    public static ArrayList<String> nhap() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> name = new ArrayList<String>();
        System.out.print("Nhap ten: ");
        while(true){
            String nhapten = scanner.nextLine();
            name.add(nhapten);
            
            System.out.print("Nhap them (N)? ");
            if(scanner.nextLine().equals("N")) {
               break; 
            }
        }
        return name;
    }
    public static void xuat() {
     
        System.out.print(nhap());
        
    }
    public static void sapxep() {
        
       Collections.sort(nhap());
       System.out.print(nhap());
        
    }
    public static void ngaunhien() {
        
        Collections.shuffle(nhap());
        System.out.print(nhap());
        
    }
    public static void xoa() {
        
    }
}
