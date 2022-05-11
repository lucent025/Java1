/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4.Lab4_3;

import lab4.Lab4_2.*;

/**
 *
 * @author hoangluc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SanPham sp1 = new SanPham("sp1", 10000, 5);
        SanPham sp2 = new SanPham("sp2", 20000);

        sp1.xuat();
        
        sp2.xuat();
    }

}
