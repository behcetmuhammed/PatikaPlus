package Week2;

import java.util.Scanner;
import java.util.Random;

/*
    Dizideki Elemanların Ortalamasını Hesaplayan Program

    Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.
    Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi
    Harmonik Seri Formülü :

 */
public class HarmonicSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin boyutunu giriniz: "); //dizinin boyutunu kullanıcdan aldık..
        int n = input.nextInt();

        int[] arr = new int[n];

        //Rastgele random dizi oluşturma..
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomNumber = random.nextInt(10); // 0 ile 10 arasında sayılar al..
            arr[i] = randomNumber;
        }
        System.out.print("Rastgele oluşturulan dizi elemanları: ");
        for (int i = 0; i < arr.length; i++) { // diziyi ekrana yazdırma
            System.out.print(arr[i] + ", ");
        }

        //Ortalama hesaplama
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("\nDizi elemanlarının toplamı: " + sum);
        System.out.println("Dizi elemanlarının ortalaması: " + sum / n);

        //Hermonik hesaplama
        double harmonicSeries;
        double total = 0;
        boolean hasZero = false; //eğer dizi elemanları arasında 0 varsa //payda sıfır olamaz
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                harmonicSeries = 1.0 / arr[i];
                total += harmonicSeries;
            }else {
                hasZero = true;
                System.out.println("Dizi indexlerinin için de 0 elemanı var. Payda sıfır olamayacağı için Harmonic hesaplanamaz!");
                break;
            }
        }
        if (!hasZero) { // 0 yoksa sonuçları yazdir
            System.out.println("Harmonic Series: " + total);
            System.out.println("Harmonic: " + n / total);
        }

        //Bide ForEach le yap.. unutma.. pratik
    }
}
