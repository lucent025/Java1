package controller;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        DanhSachNhanVien ds = new DanhSachNhanVien();

        do {
            System.out.println("\nMenu chuong trinh:");
            System.out.println("1. Nhap danh sach nhan vien tu ban phim.");
            System.out.println("2. Xuat danh sach nhan vien ra man hinh");
            System.out.println("3. Tim và hien thi nhan vien theo ma nhap tu ban phim.");
            System.out.println("4. Xoa nhan vien theo ma nhap tu ban phim.");
            System.out.println("5. Sap xep nhan vien giam dan theo ma nhap tu ban phim.");
            System.out.println("6. Sap xep nhan tang vien theo ma nhap tu ban phim.");
            System.out.println("7. Ket thuc chuong trinh.");
            System.out.println("Nhap [1-5]");

            String opt = ds.validation("Hay nhap lua chon: ", "[1-9]{1,2}");
            switch (opt) {
                case "1" -> {
                    ds.nhapThongTin();
                    break;
                }
                case "2" -> {
                    ds.xuatThongTin();
                    break;
                }
                case "3" -> {
                    ds.searchByID();
                    break;
                }
                case "4" -> {
                    ds.deleteByID();
                    break;
                }
                case "5" -> {
                    ds.sortByIDdecrease();
                    break;
                }
                case "6" -> {
                    ds.sortByIDincrease();
                    break;
                }
                case "7" -> {
                    System.exit(0);
                }
            }
        } while (true);
    }
}
