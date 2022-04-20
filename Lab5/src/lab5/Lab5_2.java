/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Lab5_2 {

    static ArrayList name = new ArrayList<String>();
    
    public static void main(String[] args) {
        // TODO code application logic here
        menu();
        
    }
    
    static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap lua chon: ");
        int luachon = scanner.nextInt();
        switch(luachon){
            case 1:
                String ten = scanner.nextLine();
                System.out.print("Nhap ten: ");
                nhap(ten);
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
            case 6:
                System.exit(0);
            default:
                menu();
        }
    }
    static ArrayList nhap(String nhapten) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            nhapten = scanner.nextLine();
            name.add(nhapten);
            
            System.out.print("Nhap them (Y/N)? ");
            if(scanner.nextLine().equals("N")) {
               break; 
            } else {
                System.out.print("Nhap ten: ");
            }
        }
        return name;
    }
    static void xuat() {
     
        System.out.println(name);
        for(var x : name){
                System.out.println(x);
            }
        
    }
    static void sapxep() {
        
       Collections.sort(name);
       System.out.println(name);
       for(var x : name){
                System.out.println(x);
            }
        
    }
    static void ngaunhien() {
        
        Collections.shuffle(name);
        System.out.println(name);
        for(var x : name){
                System.out.println(x);
            }
        
    }
    static void xoa() {
        
    }

}
