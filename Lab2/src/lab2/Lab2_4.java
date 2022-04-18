
package lab2;
import java.util.Scanner;
import static lab2.Lab2_1.ptbac1;
import static lab2.Lab2_2.ptbac2;
import static lab2.Lab2_3.tiendien;

public class Lab2_4 {
    public static void main(String[] args){
        menu();
    }
    public static void menu(){
        System.out.print("+----------------------------------------+\n");
        System.out.print("|                                        |\n");      
        System.out.print("|    1. Giai phuong trinh bac nhat.      |\n");
        System.out.print("|    2. Giai phuong trinh bac hai        |\n");
        System.out.print("|    3. Tinh tien dien su dung.          |\n");
        System.out.print("|    4. Ket thuc chuong trinh.           |\n");
        System.out.print("|                                        |\n");        
        System.out.print("+----------------------------------------+\n");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Hay nhap lua chon: ");
        int opt = scanner.nextInt();
        
        switch(opt){
            case 1:
                ptbac1();
                end();
                break;
            case 2:
                ptbac2();
                end();
                break;
            case 3:
                tiendien();
                end();
                break;
            case 4:
                System.exit(0);
            default:
                System.out.print("####################################\n");
                System.out.print("#                                  #\n");
                System.out.print("#    Nhap sai, xin hay nhap lai!   #\n");
                System.out.print("#                                  #\n");
                System.out.print("####################################\n");             
                menu();
        }
        
    }
    public static void end(){
        System.out.print("+----------------------------------------+\n");
        System.out.print("|                                        |\n");      
        System.out.print("|    Ban co muon tiep tuc chuong trinh?  |\n");
        System.out.print("|         1. Tiep tuc.      2.Thoat.     |\n");      
        System.out.print("|                                        |\n");      
        System.out.print("+----------------------------------------+\n");
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hay nhap lua chon: ");
        int YoN = scanner.nextInt();
        
        switch (YoN){
            case 1:
                menu();
                break;
            case 2:
                System.exit(0);
                break;
            default:
                System.out.print("####################################\n");
                System.out.print("#                                  #\n");
                System.out.print("#    Nhap sai, xin hay nhap lai!   #\n");
                System.out.print("#                                  #\n");
                System.out.print("####################################\n");             
                end();
        }
    }
}