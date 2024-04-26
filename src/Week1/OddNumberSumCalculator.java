package Week1;
import java.util.Scanner;

/*
    Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden
    tek sayıları toplayıp ekrana basan programı yazıyoruz.

    ## Ödev
    Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün
    katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
*/
public class OddNumberSumCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, toplam = 0;

        do {
            System.out.print("Sayı girin: ");
            n = input.nextInt();
            if(n % 2 == 0 && n % 4 == 0){ // Çift ve 4'ün katları
                toplam += n;
            }
        }while (n % 2 == 0);

        System.out.println("Çift ve 4'ün katı olan sayıların toplamı: " + toplam);
/*
        int n, toplam = 0;
        do {
            System.out.print("Sayi girin: ");
            n = input.nextInt();
            if (n % 2 != 0) {
                toplam += n;
            }
        } while (n >= 0);
        System.out.println("Tek sayıların toplamı: " + toplam);*/
    }
}
