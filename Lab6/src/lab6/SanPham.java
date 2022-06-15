package lab6;


public class SanPham {
    private String tenSp;
    private double giaSp;
    private String hang;

    public SanPham() {
    }

    public SanPham(String tenSp, double giaSp, String hang) {
        this.tenSp = tenSp;
        this.giaSp = giaSp;
        this.hang = hang;
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

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }
    
}
