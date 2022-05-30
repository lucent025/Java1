package assignment;

public class NhanVien {

    protected String tenNV;
    protected String chucVu;
    protected String maSoNV;
    protected double luongNV;

    public NhanVien(String maSoNV, String tenNV, String chucVu, double luongNV) {
        this.maSoNV = maSoNV;
        this.tenNV = tenNV;
        this.chucVu = chucVu;
        this.luongNV = luongNV;
    }

 

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getMaSoNV() {
        return maSoNV;
    }

    public void setMaSoNV(String maSoNV) {
        this.maSoNV = maSoNV;
    }

    public double getLuongNV() {
        return luongNV;
    }

    public void setLuongNV(double luongNV) {
        this.luongNV = luongNV;
    }

    public double getThuNhap() {
        return luongNV;
    }

    public double getThueTN() {
        if (luongNV < 9) {
            return luongNV * 0;
        } else if (luongNV > 9 && luongNV < 15) {
            return luongNV * 0.1;
        } else {
            return luongNV * 0.12;
        }
    }

}
