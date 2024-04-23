package Week1;
/*
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
(Not : KDV tutarını 18% olarak alın)
KDV'siz Fiyat = 10;
KDV'li Fiyat = 11.8;
KDV tutarı = 1.8;

## Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV
tutarı hesaplayan programı yazınız.
* */

import java.util.Scanner;
public class kdvHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Para Değerini Giriniz: ");
        int para = input.nextInt();
        double kdv;
        if (para<=1000){kdv = 0.18;}
        else{kdv = 0.08;}
        // veya: (para<=1000) ? kdv = 0.18 : kdv = 0.08;
        double kdvFiyat = para * kdv;
        double sonFiyat = para + kdvFiyat;
        String formatliKdvFiyat = String.format("%.1f", kdvFiyat); // Virgülden sonra bir basamaklı olarak formatla
        System.out.println("KDV'siz Fiyat: " + para);
        System.out.println("KDV'li Fiyat: " + sonFiyat);
        System.out.println("KDV Tutarı: " + formatliKdvFiyat);
    }
}
