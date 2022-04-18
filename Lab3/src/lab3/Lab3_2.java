package lab3;


public class Lab3_2 {
    public static void main(String[] args) {
        Bang9Chuong();
    }
    public static void Bang9Chuong(){
        int[] index = {1,2,3,4,5,6,7,8,9,10};
        int ketqua;
        for (int soHang = 2; soHang<=9;soHang++){
            for (int x : index){
            ketqua = soHang * x;
            System.out.printf("%d x %d = %d\n",soHang,x,ketqua);
            }
            System.out.print("-----------------\n");
        }
    }
}
