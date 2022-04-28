package lab5;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Lab5_3 {

    static ArrayList name = new ArrayList<String>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        Lab5_3 lab53 = new Lab5_3();
        String tensanpham = scanner.nextLine();
        System.out.print("Nhap ten: ");
        lab53.nhap(tensanpham);
        System.out.print(name);
        lab53.sapxep();
    }

    ArrayList nhap(String nhapsanpham) {
        while (true) {
            nhapsanpham = scanner.nextLine();
            name.add(nhapsanpham);

            System.out.print("Nhap them (Y/N)? ");
            if (scanner.nextLine().equalsIgnoreCase("n")) {
                break;
            } else {
                System.out.print("Nhap ten: ");
            }
        }
        return name;
    }

    void sapxep() {
        Collections.sort(name);
        System.out.print(name);
    }
}
