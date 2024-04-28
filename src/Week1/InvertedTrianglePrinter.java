package Week1;
import java.util.Scanner;
/*
    Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile ekrana
    ters üçgen çizen programı yazın.
 */
public class InvertedTrianglePrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Basamak sayısını giriniz: ");
        int basamakSayisi = input.nextInt();

        for (int i = basamakSayisi; i >= 1; i--) {
            // Boşlukları yazdırmak
            for (int j = 1; j <= basamakSayisi - i; j++) {
                System.out.print(" ");
            }
            // Yıldızları yazdırmak
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println(); // alt satıra geç
        }
    }
}
