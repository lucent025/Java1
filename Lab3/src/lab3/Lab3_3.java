package lab3;
import java.util.Arrays;
import java.util.Scanner;

public class Lab3_3 {
    public static void main(String[] args) {
        mang();
    }
    public static void mang(){
        int soPhanTu,index = 0;
        Scanner scanner = new Scanner(System.in);
        
        do {
            System.out.print("Nhap vao so phan tu cua mang: ");
            soPhanTu = scanner.nextInt();
        } while (soPhanTu < 1);
        
        int arr[] = new int[soPhanTu];
        for (int i = 0; i < soPhanTu; i++){
            System.out.printf("Nhap phan tu thu %d: ", i);
            arr[i] = scanner.nextInt();
        }
        System.out.println("Mang goc: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Mang sau khi sap xep: " + Arrays.toString(arr));
        System.out.println("Phan tu nho nhat: " +  arr[0]);
        
        float avrg = 0;
        for (int x : arr){
            if (x % 3 == 0){
                avrg += x;
                index++;
            }
        
        }
        if (avrg != 0){
            avrg /= index;
            System.out.printf("Trung binh cong so chia het cho 3 la: %.2f\n", avrg);
        }

    }    
}
