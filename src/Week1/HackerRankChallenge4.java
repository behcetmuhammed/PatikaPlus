package Week1;

import java.util.Scanner;

public class HackerRankChallenge4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sorgu sayını giriniz: ");
        int sorgu = input.nextInt(); // Sorgu sayısını aldık

        for (int i = 0; i < sorgu; i++) {
            System.out.print("Enter a, b, and n for query " + (i + 1) + ": ");
            int a = input.nextInt();
            int b = input.nextInt();
            int n = input.nextInt();

            for (int j = 0; j < n; j++) {
                int term = a; // İlk terim a ile başlar
                for (int k = 0; k <= j; k++) {
                    term += Math.pow(2, k) * b; // İlgili terimi hesapla
                }
                System.out.print(term + " ");
            }
            System.out.println(); // Bir sonraki sorguya geçmek için yeni satır ekle
        }
    }
}
