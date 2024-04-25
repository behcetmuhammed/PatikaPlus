package Week1;
import java.util.Scanner;

public class HackerRankChallenge2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = 1;
        if (1 <= n && n <= 100) {
            if (n % 2 * k != 0) {
                System.out.println("Weird");
            } else if (n >= 2 && n <= 5) {
                if (n % 2 * k == 0) {
                    System.out.println("Not Weird");
                }
            } else if (n >= 6 && n <= 20) {
                if (n % 2 * k == 0) {
                    System.out.println("Weird");
                }
            } else if (n >= 20) {
                if (n % 2 * k == 0) {
                    System.out.println("Not Weird");
                }
            }
        } else {
            System.out.println("Invalid value of n");
        }
    }
}
