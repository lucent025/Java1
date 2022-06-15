package lab6;


public class SinhVien {
    private String tenSv;
    private String Email;
    private String phone;
    private String cmnd;

    public SinhVien() {
    }

    public SinhVien(String tenSv, String Email, String phone, String cmnd) {
        this.tenSv = tenSv;
        this.Email = Email;
        this.phone = phone;
        this.cmnd = cmnd;
    }

    public String getTenSv() {
        return tenSv;
    }

    public void setTenSv(String tenSv) {
        this.tenSv = tenSv;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }
    
}
