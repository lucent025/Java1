package lab8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap so a: ");
        double a = input.nextDouble();
        System.out.print("Nhap so b: ");
        double b = input.nextDouble();
        System.out.print("Nhap so c: ");
        double c = input.nextDouble();

        System.out.println("Tong 3 so la: " + XPoly.sum(a, b, c));
        System.out.println("So nho nhat: " + XPoly.min(a, b, c));
        System.out.println("So lon nhat: " + XPoly.max(a, b, c));

        System.out.println("Nhap vao chuoi:");
        String chuoi = input.nextLine();
        System.out.println("Chuoi sau khi viet hoa: " + XPoly.toUpperFirstChar(chuoi));
    }
}
