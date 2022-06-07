package bai5;

public class SanPham {

    private String tenSp;
    private double giaSp;
    //constructers
    
    public SanPham() {
        
    }
    
    public SanPham(String tenSp, double giaSp) {
        this.tenSp = tenSp;
        this.giaSp = giaSp;
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

}
