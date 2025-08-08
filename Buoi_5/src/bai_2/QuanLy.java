package bai_2;

public class QuanLy {
    private String maQL;
    private String tenQL;

    public QuanLy(String maQL, String tenQL) {
        this.maQL = maQL;
        this.tenQL = tenQL;
    }

    public void output() {
        System.out.println("Ma quan ly: " + maQL + ", Ten quan ly: " + tenQL);
    }
}
