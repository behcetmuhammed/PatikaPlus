package Week1;
import java.util.Scanner;

public class HackerRankChallenge3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int result = 1;
        for (int i = 1; i <= 10; i++) {
            result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
    }
}
