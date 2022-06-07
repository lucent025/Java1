package assignment.model;

public class NhanVienTiepThi extends NhanVien {

    protected double doanhSo;
    protected double hueHong;

    public NhanVienTiepThi() {
    }
    
    public NhanVienTiepThi(String maSoNV, String tenNV, String chucVu, double luongNV, double doanhSo, double hueHong) {
        super(maSoNV, tenNV, chucVu, luongNV);
        this.doanhSo = doanhSo;
        this.hueHong = hueHong;
    }

    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHueHong() {
        return hueHong;
    }

    public void setHueHong(double hueHong) {
        this.hueHong = hueHong;
    }

    @Override //annotation = nhac nho?
    public double getThuNhap() {
        return luongNV = doanhSo + hueHong + luongNV;
    }
}
