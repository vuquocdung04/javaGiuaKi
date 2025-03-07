public class Account {
    long soTaiKhoan = 50;
    public long getSoTaiKhoan() {
        return soTaiKhoan;
    }
    public void setSoTaiKhoan(long soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }
    ///
    String tenTaiKhoan;
    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }
    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }
    ///
    double tienTaiKhoan;

    public double getTienTaiKhoan() {
        return tienTaiKhoan;
    }
    public void setTienTaiKhoan(double tienTaiKhoan) {
        this.tienTaiKhoan = tienTaiKhoan;
    }
    public Account(){

    }
    public Account(long soTaiKhoan, String tenTaiKhoan, double tienTaiKhoan){
        this.soTaiKhoan = soTaiKhoan;
        this.tenTaiKhoan = tenTaiKhoan;
        this.tienTaiKhoan = tienTaiKhoan;
    }
    
    public String toString(){
        return "So tai khoan: " + soTaiKhoan + "\n" 
                + "Ten tai khoan: " + tenTaiKhoan +"\n"
                + "Tien tai khoan: " + tienTaiKhoan;
    }

    double laiSuat = 0.035f;
    public double NapTien(double param){
        
        tienTaiKhoan += param;
        return tienTaiKhoan;
    }

    public double RutTien(double param){
        tienTaiKhoan -= param;
        return tienTaiKhoan;
    }

    public double DaoHan(double param){
        return tienTaiKhoan + tienTaiKhoan*laiSuat;
    }

    public double ChuyenTien(double param){
        return tienTaiKhoan -= param;
    }



}
