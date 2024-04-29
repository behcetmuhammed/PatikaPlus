package Week2;

import java.util.Scanner;

/*
    ## Gelişmiş Hesap Makinesi
    Java ile kullanıcın seçtiği işlemleri yapan hesap makinesi yapıyoruz.

    Hesap makinesinin fonksiyonları :
    1- Toplama İşlemi
    2- Çıkarma İşlemi
    3- Çarpma İşlemi
    4- Bölme işlemi
    5- Üslü Sayı Hesaplama
    6- Faktoriyel Hesaplama
    7- Mod Alma
    8- Dikdörtgen Alan ve Çevre Hesabı
 */
public class AdvancedCalculator {
    //toplama
    static int toplama(int sayi1, int sayi2) {
        int result = sayi1 + sayi2;
        System.out.println("Toplama sonucu: " + result);
        return result;
    }

    //çıkarma
    static int cikarma(int sayi1, int sayi2) {
        int result = sayi1 - sayi2;
        System.out.println("Çıkarma sonucu: " + result);
        return result;
    }

    //Çarpma
    static int carpma(int sayi1, int sayi2) {
        int result = sayi1 * sayi2;
        System.out.println("Çarpma sonucu: " + result);
        return result;
    }

    //Bölme
    static int bolme(int sayi1, int sayi2) {
        if(sayi2 == 0){
            System.out.println("Payda sıfır olamaz. Sıfırdan farklı bir sayı seçiniz.");
        }else{
            int result = sayi1 / sayi2;
            System.out.println("Bölme sonucu: " + result);
            return result;
        }
        return 1;
    }

    //Üslü sayı hesaplama
    static int usluSayiHesaplama(int taban, int us) {
        int result = 1;
        for (int i = 0; i < us; i++) {
            result *= taban;
        }
        System.out.println("işlem sonucu: " + result);
        return result;
    }

    //Faktöriyel hesaplama
    static int faktoriyelHesapla(int sayi) {
        int fact = 1;
        for (int i = sayi; i > 0; i--) {
            fact *= i;
        }
        System.out.println(sayi + " sayısının faktöriyel değeri: " + fact);
        return 1;
    }

    //Mod alma hesaplama
    static int modAlma(int sayi, int mod) {
        int result = sayi % mod;
        System.out.println(sayi + " mod" + "(" + mod + ")" + " işleminin sonucu: " + result);
        return result;
    }

    //Dikdörtgenin alanını ve çevresini hesaplama hesaplama
    static int dikdortgenaAlanCevre(int uzun, int kisa) {
        int cevre = 2 * (kisa + uzun);
        int alan = kisa * uzun;
        System.out.println("Dikdörtgenin alanı: " + alan + ", Çevresi: " + cevre);
        return 1;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            String menu = "1- Toplama işlemi\n"
                    + "2- Çıkarma işlemi\n"
                    + "3- Çarpma işlemi\n"
                    + "4- Bölme işlemi\n"
                    + "5- Üslü sayı hesaplama işlemi\n"
                    + "6- Faktöriyel hesaplama işlemi\n"
                    + "7- Mod alma işlemi\n"
                    + "8- Dikdörtgenin alanını ve çevresini hesaplama işlemi\n"
                    + "0- Çıkış yap";
            System.out.println("\nMerhaba Emir Hesap Makinesine hoş geldiniz!\n" + menu);

            System.out.print("\nLütfen üst menüden yapacağınız işlemi seçiniz: ");
            int select = input.nextInt();
            int sayi1=0, sayi2=0; //burada hata almamak adına default olarak sayı değerlerini 0 yaptık
            if(select==6){ //bunları if bloğunun içine koyma sebebim eğer Faktöriyel almak istersek 2 sayı yerine bir sayıya ihtiyacımız olacak
                System.out.print("Lütfen faktöriyelini almak istediğiniz sayıyı girin: ");
                sayi1 = input.nextInt();
            }else if(select==0){
                System.out.println("Çıkış yapıldı. Görüşmek üzere!");
                break;
            } else if (select==8) {
                System.out.print("Lütfen kısa kenar değerini giriniz girin: ");
                sayi1 = input.nextInt();
                System.out.print("Lütfen uzun kenar değerini giriniz girin: ");
                sayi2 = input.nextInt();
            } else{
                System.out.print("Lütfen 1. sayıyı girin: ");
                sayi1 = input.nextInt();
                System.out.print("Lütfen 2. sayıyı girin: ");
                sayi2 = input.nextInt();
            }


            switch (select) {
                case 1:
                    toplama(sayi1, sayi2);
                    break;
                case 2:
                    cikarma(sayi1, sayi2);
                    break;
                case 3:
                    carpma(sayi1, sayi2);
                    break;
                case 4:
                    bolme(sayi1, sayi2);
                    break;
                case 5:
                    usluSayiHesaplama(sayi1, sayi2);
                    break;
                case 6:
                    faktoriyelHesapla(sayi1);
                    break;
                case 7:
                    modAlma(sayi1, sayi2);
                    break;
                case 8:
                    dikdortgenaAlanCevre(sayi1, sayi2);
                    break;

                default:
                    System.out.println("Geçersiz bir işlem girdiniz!.");
            }
        }
    }
}
