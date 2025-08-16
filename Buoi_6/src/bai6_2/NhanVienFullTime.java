package bai6_2;

public class NhanVienFullTime extends NhanVien {
    private double luongCoBan;
    private double tienThuong;

    public NhanVienFullTime(String maNV, String ten, int tuoi, String email, String soDienThoai, double luongCoBan, double tienThuong) {
        super(maNV, ten, tuoi, email, soDienThoai);
        this.luongCoBan = luongCoBan;
        this.tienThuong = tienThuong;
    }

    public NhanVienFullTime(double luongCoBan, double tienThuong) {
        this.luongCoBan = luongCoBan;
        this.tienThuong = tienThuong;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getTienThuong() {
        return tienThuong;
    }

    public void setTienThuong(double tienThuong) {
        this.tienThuong = tienThuong;
    }

    public NhanVienFullTime(String maNV, String ten, int tuoi, String email, String soDienThoai) {
        super(maNV, ten, tuoi, email, soDienThoai);
    }

    @Override
    public double tinhLuong() {
        return (luongCoBan+ tienThuong);
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println(" Loai: Full Time");
    }
}
