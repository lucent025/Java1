/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5;

import java.util.Scanner;
import java.util.ArrayList;
public class Lab5_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        String name = input.nextLine();
        menu(name);
        
    }
    
    public static ArrayList<String> menu(ArrayList<String> name) {
        String subname = "Luc";
        name.add(subname);
        return name;
    }
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> name = new ArrayList<String>();
        try {
            String nhapten = new scanner.nextLine();
            while(true) {
                name.add(nhapten);
            }
        }
    }
    public void xuat() {
        
    }
    public void sapxep() {
        
    }
    public void ngaunhien() {
        
    }
    public void xoa() {
        
    }
}
