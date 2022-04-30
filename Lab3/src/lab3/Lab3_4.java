package lab3;

import java.util.Scanner;
import java.util.Arrays;

public class Lab3_4 {

    public static void main(String[] args) {
        hoTen();
    }
   
    public static void hoTen() {

        Scanner input = new Scanner(System.in);
        String[] tenSV = new String[5];
        float[] diemTB = new float[5];
        int i = 0;

        do {
            System.out.print("Nhap ten sv: ");
            tenSV[i] = input.nextLine();
            System.out.print("Nhap diem trung binh: ");
            diemTB[i] = input.nextFloat();
            input.nextLine();
            i++;
        } while (i < 5);
        
        for (int x = 0; x < 5; x++){
            if (diemTB[x] < 5 ) {
                tenSV[x] = tenSV[x] + "  Yeu";
            } else if (diemTB[x] >= 5 && diemTB[x] < 6.5) {
                tenSV[x] = tenSV[x] + "  Trung Binh";
            } else if (diemTB[x] >= 6.5 && diemTB[x] < 7.5) {
                tenSV[x] = tenSV[x] + "  Kha";
            } else if (diemTB[x] >= 7.5 && diemTB[x] < 9) {
                tenSV[x] = tenSV[x] + "  Gioi";
            } else if (diemTB[x] >= 9) {
                tenSV[x] = tenSV[x] + "  Xuat sac";
            }
        }
        
        System.out.printf("Ten sv: %s\n", Arrays.toString(tenSV));
        System.out.printf("Diem TB: %s\n", Arrays.toString(diemTB));
        
        for (int j = 0; j < diemTB.length - 1; j++){
            for (int k = j+1; k < diemTB.length; k++){
                if (diemTB[j] < diemTB[k]) {
                    float tempDiem = diemTB[j];
                    diemTB[j] = diemTB[k];
                    diemTB[k] = tempDiem;
                    String tempTen = tenSV[j];
                    tenSV[j] = tenSV[k];
                    tenSV[k] = tempTen;
                }
            }
        }
        System.out.println("Danh sach sau khi sap xep: ");
        System.out.printf("Ten sv: %s\n", Arrays.toString(tenSV));
        System.out.printf("Diem TB: %s\n", Arrays.toString(diemTB));
    }
}
