package Week1;

import java.util.Scanner;

/*
    Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.

    ## Senaryo
    2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
*/
public class PrimeNumberFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1 ile 100 arasındaki asal sayılar:");
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }

    }
}
