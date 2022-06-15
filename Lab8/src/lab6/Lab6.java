package lab6;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab6 {

    public static void main(String[] args) {
//        hoTen();
        nhapSanPham();
        xuatSanPham();
    }

    public static String validation(String command, String pattern) {
        Scanner scanner = new Scanner(System.in);
        String str;
        do {
            System.out.print(command);
            str = scanner.nextLine();

            if (str.matches(pattern)) {
                break;
            } else {
                System.out.println("Nhap sai, nhap lai");
            }
        } while (true);

        return str;
    }

    public static void hoTen() {

        String hoTen = validation("Nhap vao ho ten: ", "([A-Z][a-z]*\\s?){2,}");

        String ho = hoTen.substring(0, hoTen.indexOf(" ")).toUpperCase();
        String ten = hoTen.substring(hoTen.lastIndexOf(" ") + 1).toUpperCase();

        hoTen = hoTen.replace(hoTen.substring(0, hoTen.indexOf(" ")), ho);
        hoTen = hoTen.replace(hoTen.substring(hoTen.lastIndexOf(" ") + 1), ten);

        System.out.println(hoTen);
    }
    
    
    static ArrayList<SanPham> sp = new ArrayList<>();
    public static void nhapSanPham() {

        do {
            String tenSp = validation("Nhap ten san pham: ", "([a-zA-Z]*\\s?){1,}");
            if (tenSp.equalsIgnoreCase("stop")) {
                break;
            }
            String hangSp = validation("Nhap hang san pham: ", "([A-Z][a-z]*\\s?){1,}");
            String strGiaSp = validation("Nhap gia san pham: ", "[0-9]{1,3}");
            double giaSp = Double.parseDouble(strGiaSp);

            sp.add(new SanPham(tenSp, giaSp, hangSp));
        } while (true);
    }
    //2036
    public static void xuatSanPham() {
        for (SanPham sanPham : sp) {
            if (sanPham.getHangSp().equals("Nokia")) {
                System.out.printf("%s | %.2f trieu | %s\n",
                        sanPham.getTenSp(),
                        sanPham.getGiaSp(),
                        sanPham.getHangSp());
            }
        }
    }
}
