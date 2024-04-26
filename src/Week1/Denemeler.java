package Week1;
import java.util.Scanner;

public class Denemeler {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("================================");

        for (int i = 0; i < 3; i++) {
            String str = input.next();
            int x = input.nextInt();

            System.out.println(String.format("%-15s%03d", str, x));
        }

        System.out.println("================================");

    }
}
