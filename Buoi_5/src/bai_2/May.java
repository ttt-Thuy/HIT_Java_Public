package bai_2;

public class May {
    private String maMay;
    private String tenMay;
    private String tinhTrang;

    public May(String maMay, String tenMay, String tinhTrang) {
        this.maMay = maMay;
        this.tenMay = tenMay;
        this.tinhTrang = tinhTrang;
    }

    public void output() {
        System.out.println("  Ma may: " + maMay + ", Ten may: " + tenMay + ", Tinh trang: " + tinhTrang);
    }
}
