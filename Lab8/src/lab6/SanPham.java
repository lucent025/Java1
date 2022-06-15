package lab6;

public class SanPham {

    private String tenSp;
    private double giaSp;
    private String hangSp;

    public SanPham() {
    }

    public SanPham(String tenSp, double giaSp, String hangSp) {
        this.tenSp = tenSp;
        this.giaSp = giaSp;
        this.hangSp = hangSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getGiaSp() {
        return giaSp;
    }

    public void setGiaSp(double giaSp) {
        this.giaSp = giaSp;
    }

    public String getHangSp() {
        return hangSp;
    }

    public void setHangSp(String hangSp) {
        this.hangSp = hangSp;
    }
}
