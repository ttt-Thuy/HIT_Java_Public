package bai_2;

public class PhongMay {
    private String maPhong;
    private String tenPhong;
    private double dienTich;
    private QuanLy quanLy;
    private May[] dsMay;

    public PhongMay(String maPhong, String tenPhong, double dienTich, QuanLy quanLy, May[] dsMay) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.dienTich = dienTich;
        this.quanLy = quanLy;
        this.dsMay = dsMay;
    }

    public void output() {
        System.out.println("Mã phòng: " + maPhong + ", Tên phòng: " + tenPhong + ", Diện tích: " + dienTich);
        quanLy.output();
        System.out.println("Danh sách máy:");
        for (May m : dsMay) {
            m.output();
        }
    }
}
