package Week1;

import java.util.Scanner;

/*
N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.
Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir. Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.

1342 sayısına da bakalım. (1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16=354 sayısı 1342’ye eşit olmadığı için armstrong sayı olmaz.

1634=1^4+6^4+3^4+4^4=1+1296+81+256=1634                           => armstrong sayısı
54748=5^5+4^5+7^5+4^5+8^5=3125+1024+16807+1024+32768=54748        => armstrong sayısı
*/

public class ArmstrongNumbersFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen sayı giriniz: ");
        int sayi = input.nextInt();
        /*
            Süreçler:
            1- Bu sayıyı kullanıcdan al
            2- Bu sayının kaç basamktan oluştuğunu öğren?
            3- bu sayının her basamak sayısını al
            4- istenilen işlemi tamamla
        */
        int basamakSayisi = 0;
        int temp = sayi; // sayıyı geçici değişkene atadık. Amaç sayının asıl değerini kaybetmemek
        while (temp != 0) {
            temp /= 10;
            basamakSayisi++;
        }
        System.out.println("Basamak Sayısı: " + basamakSayisi);

        temp = sayi; // sayıyı geçici değişkene atadık ve böylece sayı tekradan eski değerine döndü
        int basamakHanesi, sonuc = 0;
        while (temp != 0) {
            basamakHanesi = temp %10;

            int islem = 1;
            for(int i = 0; i<basamakSayisi ; i++){ //basamakSayisi = Üs sayımız
                islem *= basamakHanesi;            //basamakHanesi = Taban sayımız
            }
            sonuc = sonuc + islem;
            temp /= 10;
        }
        System.out.println("Sonuç: " +sonuc);

        if(sayi == sonuc){
            System.out.println(sayi + " sayısı bir Armstrong sayısıdır. Çünkü " + sayi+ " eşittir " + sonuc);
        }else{
            System.out.println(sayi + " sayısı bit Armstrong sayısı değildir!. Çünkü " + sayi+ " eşit değidir " + sonuc);
        }
    }

}
