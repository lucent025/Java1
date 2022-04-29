package lab5.Lab5_3;

public class SanPham {

    private String tenSP;
    private int giaSP;

    public SanPham() {
        this.tenSP = null;
        this.giaSP = 0;
    }

    public SanPham(String tenSP, int giaSP) {
        this.tenSP = tenSP;
        this.giaSP = giaSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(int giaSP) {
        this.giaSP = giaSP;
    }

}
