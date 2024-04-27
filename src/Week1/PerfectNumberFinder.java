package Week1;
import java.util.Scanner;
/*
    Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise
    ekrana “mükemmel sayıdır.” değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.

    Mükemmel Sayı Nedir ?
    Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine
    eşit olan sayıya mükemmel sayı denir.

    ## Senaryolar
    Bir sayı giriniz: 28
    28 Mükemmel sayıdır
    Bir sayı giriniz: 1
    1 Mükemmel sayı değildir.
    Bir sayı giriniz: 496
    496 Mükemmel sayıdır

 */
public class PerfectNumberFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kontrol edilecek sayıyı giriniz: ");
        int sayi = input.nextInt();

        int toplam = 0;
        for (int i = 1; i < sayi; i++) {
            if(sayi % i == 0){
                toplam +=i;
            }
        }
        System.out.println("Girdiğiniz sayının kendisi hariç pozitif tam bölenlerinin toplamı: " +toplam);
        if(toplam == sayi){
            System.out.println(sayi + " mükemmel sayıdır.");
        }else{
            System.out.println(sayi + " mükemmel sayı değildir.");
        }
    }
}
