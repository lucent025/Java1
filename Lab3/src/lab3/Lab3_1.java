package lab3;
import java.util.Scanner;

public class Lab3_1 {
    public static void main(String[] args) {
        soNguyenTo();
    }
    public static void soNguyenTo(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap vao so nguyen N: ");
        int N = scanner.nextInt();
        
        boolean status = true ;
        for (int i = 2; i<N-1;i++){
            if (N % i == 0){
                status = false;
                break;
            }   
        }
        if (status == false){
            System.out.printf("%d khong phai so nguyen to!", N);
        } else {
            System.out.printf("%d la so nguyen to!", N);
        }
    }
}