import java.util.Scanner;

public class BTTT1 {


    final static String SQUARE = "Hinh vuong: ";
    final static String TRIANGLE = "Hinh chu nhat: ";
    final static String CIRCLE = "Hinh tron: ";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap hinh dang vien gach: ");
        String type = sc.nextLine();

        double S = 0;

        if (type.equalsIgnoreCase(SQUARE)) {
            System.out.println("Nhap canh a: ");
            double a = sc.nextDouble();
            S = a * a;

        } else if (type.equalsIgnoreCase(TRIANGLE)) {
            System.out.print("Nhap canh day ");
            double CDay = sc.nextDouble();
            System.out.print("Nhap chieu cao ");
            double h = sc.nextDouble();
            S= 0.5 * CDay * h;

        } else if (type.equalsIgnoreCase(CIRCLE)) {
            System.out.print("Nhap ban kinh ");
            double r = sc.nextDouble();
            S = Math.PI * r * r;
        } else {
            System.out.println("khong hop le ");
            return;
        }

        System.out.println("Diện tích của viên gạch là: " + S);
    }
}
