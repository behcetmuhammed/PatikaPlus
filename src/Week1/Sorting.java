package Week1;

import java.util.Scanner;

/*
    Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
*/
public class Sorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //1. Yöntem

        System.out.print("Lütfen 1. Sayıyı Giriniz: ");
        int sayi1 = input.nextInt();
        System.out.print("Lütfen 1. Sayıyı Giriniz: ");
        int sayi2 = input.nextInt();
        System.out.print("Lütfen 1. Sayıyı Giriniz: ");
        int sayi3 = input.nextInt();

        if (sayi1 < sayi2 && sayi1 < sayi3) {
            if (sayi2 < sayi3) {
                System.out.print("Sıralama: " + sayi1 + " => " + sayi2 + " => " + sayi3);
            } else {
                System.out.print("Sıralama: " + sayi1 + " => " + sayi3 + " => " + sayi2);
            }
        } else if (sayi2 < sayi1 && sayi2 < sayi3) {
            if (sayi1 < sayi3) {
                System.out.print("Sıralama: " + sayi2 + " => " + sayi1 + " => " + sayi3);
            } else {
                System.out.print("Sıralama: " + sayi2 + " => " + sayi3 + " => " + sayi1);
            }

        } else {
            if (sayi1 < sayi2) {
                System.out.print("Sıralama: " + sayi3 + " => " + sayi1 + " => " + sayi2);
            } else {
                System.out.print("Sıralama: " + sayi3 + " => " + sayi2 + " => " + sayi1);
            }
        }
        {
        }

/*
         //2. yöntem (diziler)
        System.out.print("Kaç sayı sıralamak istersiniz? Lütfen yazın:  ");
        int n = input.nextInt();

        // Java da dizi tanımlama:
        // veri_tipi[] dizi_adi = new veri_tipi[dizi_uzunlugu];
        int[] dizi = new int[n];

        for(int i=0; i < n; i++){
            System.out.print("Sıralamak istediğiniz "+ (i+1) + ". sayıyı giriniz: ");
            dizi[i] = input.nextInt();
        }

        System.out.println("Seçtiniz Sayılar: ");
        for(int i=0; i < n; i++){
            System.out.println(dizi[i] + ", ");
        }

        int tmp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (dizi[j] > dizi[j + 1]) {
                    tmp = dizi[j];
                    dizi[j] = dizi[j + 1];
                    dizi[j + 1] = tmp;
                }
            }
        }
        System.out.println("Küçükten Büyüğe Doğru Sıralama: ");
        for(int i=0; i < n; i++){
            System.out.print(dizi[i] + " => ");
        }*/
    }
}
