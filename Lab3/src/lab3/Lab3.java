package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3 {

    public static void main(String[] args) {
        soNguyenTo();
//        Bang9Chuong();
//        mang();
//        hoTen();
    }

    public static void soNguyenTo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao so nguyen N: ");
        int N = scanner.nextInt();

        boolean status = true;
        for (int i = 2; i < N - 1; i++) {
            if (N % i == 0) {
                status = false;
                break;
            }
        }
        if (status == false) {
            System.out.printf("%d khong phai so nguyen to!", N);
        } else {
            System.out.printf("%d la so nguyen to!", N);
        }
    }
    
//    public static void Bang9Chuong(){
//        int[] index = {1,2,3,4,5,6,7,8,9,10};
//        int ketqua;
//        for (int soHang = 2; soHang<=9;soHang++){
//            for (int x : index){
//            ketqua = soHang * x;
//            System.out.printf("%d x %d = %d\n",soHang,x,ketqua);
//            }
//            System.out.print("-----------------\n");
//        }
//    }
//    
//    public static void mang(){
//        int soPhanTu,index = 0;
//        Scanner scanner = new Scanner(System.in);
//        
//        do {
//            System.out.print("Nhap vao so phan tu cua mang: ");
//            soPhanTu = scanner.nextInt();
//        } while (soPhanTu < 1);
//        
//        int arr[] = new int[soPhanTu];
//        for (int i = 0; i < soPhanTu; i++){
//            System.out.printf("Nhap phan tu thu %d: ", i);
//            arr[i] = scanner.nextInt();
//        }
//        System.out.println("Mang goc: " + Arrays.toString(arr));
//        Arrays.sort(arr);
//        System.out.println("Mang sau khi sap xep: " + Arrays.toString(arr));
//        System.out.println("Phan tu nho nhat: " +  arr[0]);
//        
//        float avrg = 0;
//        for (int x : arr){
//            if (x % 3 == 0){
//                avrg += x;
//                index++;
//            }
//        
//        }
//        if (avrg != 0){
//            avrg /= index;
//            System.out.printf("Trung binh cong so chia het cho 3 la: %.2f\n", avrg);
//        }
//
//    }
//    
//    public static void hoTen() {
//
//        Scanner input = new Scanner(System.in);
//        String[] tenSV = new String[5];
//        float[] diemTB = new float[5];
//        int i = 0;
//
//        do {
//            System.out.print("Nhap ten sv: ");
//            tenSV[i] = input.nextLine();
//            System.out.print("Nhap diem trung binh: ");
//            diemTB[i] = input.nextFloat();
//            input.nextLine();
//            i++;
//        } while (i < 5);
//        
//        for (int x = 0; x < 5; x++){
//            if (diemTB[x] < 5 ) {
//                tenSV[x] = tenSV[x] + "  Yeu";
//            } else if (diemTB[x] >= 5 && diemTB[x] < 6.5) {
//                tenSV[x] = tenSV[x] + "  Trung Binh";
//            } else if (diemTB[x] >= 6.5 && diemTB[x] < 7.5) {
//                tenSV[x] = tenSV[x] + "  Kha";
//            } else if (diemTB[x] >= 7.5 && diemTB[x] < 9) {
//                tenSV[x] = tenSV[x] + "  Gioi";
//            } else if (diemTB[x] >= 9) {
//                tenSV[x] = tenSV[x] + "  Xuat sac";
//            }
//        }
//        
//        System.out.printf("Ten sv: %s\n", Arrays.toString(tenSV));
//        System.out.printf("Diem TB: %s\n", Arrays.toString(diemTB));
//        
//        for (int j = 0; j < diemTB.length - 1; j++){
//            for (int k = j+1; k < diemTB.length; k++){
//                if (diemTB[j] < diemTB[k]) {
//                    float tempDiem = diemTB[j];
//                    diemTB[j] = diemTB[k];
//                    diemTB[k] = tempDiem;
//                    String tempTen = tenSV[j];
//                    tenSV[j] = tenSV[k];
//                    tenSV[k] = tempTen;
//                }
//            }
//        }
//        System.out.println("Danh sach sau khi sap xep: ");
//        System.out.printf("Ten sv: %s\n", Arrays.toString(tenSV));
//        System.out.printf("Diem TB: %s\n", Arrays.toString(diemTB));
//    }
}
