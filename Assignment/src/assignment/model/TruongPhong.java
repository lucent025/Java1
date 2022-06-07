package assignment.model;

public class TruongPhong extends NhanVien {

    protected double trachNhiem;

    public TruongPhong() {
    }
    
    public TruongPhong(String maSoNV, String tenNV, String chucVu, double luongNV, double trachNhiem) {
        super(maSoNV, tenNV, chucVu, luongNV);
        this.trachNhiem = trachNhiem;
    }

    public double getTrachNhiem() {
        return trachNhiem;
    }

    public void setTrachNhiem(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }

    @Override
    public double getThuNhap() {
        return luongNV = luongNV + trachNhiem;
    }
}