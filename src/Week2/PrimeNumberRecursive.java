package Week2;

import java.util.Scanner;

/*
    Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın.

    ## Senaryo:
    Sayı Giriniz : 22
    22 sayısı ASAL değildir !
    Sayı Giriniz : 2
    2 sayısı ASALDIR !
    Sayı Giriniz : 39
    39 sayısı ASAL değildir !
    Sayı Giriniz : 17
    17 sayısı ASALDIR !
*/
public class PrimeNumberRecursive {

    static boolean isPrime(int sayi, int i) {
        if (i <= 1) { // Taban durum: 1 ve daha küçük sayılar asal değildir
            return true;
        }
        if (sayi % i == 0) { // Sayı asal değilse
            return false;
        }
        return isPrime(sayi, i - 1); // örneğin sayı 7 ise bölen en büyük sayı 3,5 olur. daha sonra 2,5...1,5...0,5 e kadar kontrol ederiz
        //0,5 geldiğimizde ilk if bloğu devreye girer çünkü (0,5<=1) return true olur.
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int sayi = input.nextInt();

        // bir sayının en büyük bölen sayı o sayının yarısıdır. Örnek 8'i bölen en büyük sayı 4'dür. O yüzden kontrolü 4'e kadar yapabiliriz.
        if (isPrime(sayi, sayi / 2)) // İlk bölen sayı: yani sayının yarısı.
            // eğer bütün sayıları kontrol etmek istersek if (isPrime(sayi, sayi-1)) yapabiliriz.
            System.out.println(sayi + " sayısı ASALDIR !");
        else
            System.out.println(sayi + " sayısı ASAL değildir !");
    }
}

