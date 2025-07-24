import java.util.Scanner;
import java.util.Random;

public class BTTT3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int a = rd.nextInt(101);
        int b = rd.nextInt(101);

        boolean isCorrect = rd.nextBoolean();

        int correctResult = a + b;
        int c;

        if (isCorrect) {
            c = correctResult;
        } else {

            do {
                c = rd.nextInt(201); // [0, 200]
            } while (c == correctResult);
        }

        System.out.println("Phep toan: " + a + " + " + b + " = " + c);
        System.out.print("Đap an (DUNG/SAI): ");
        String answer = sc.nextLine();

        if ((answer.equalsIgnoreCase("Dung") && isCorrect) ||
                (answer.equalsIgnoreCase("sai") && !isCorrect)) {
            System.out.println("Chinh xac!");
        } else {
            System.out.println("Chua chinh xac!");
        }
    }
}
