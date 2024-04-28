package Week2;
/*
    Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program yapıyoruz.

    Palindrom Sayı Nedir ?
    Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.

    Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
 */

import java.util.Scanner;
public class PalindromeChecker {
    //örnek sayı:    2  3  2
    static boolean isPolindrome(int sayi) {

        int temp = sayi; //sayı değerini kaybetmemek için geçici bir değişkene atadık.
        int tersSayi = 0,  sonBasamak; //sayımız başta yok. ters sayımızda dolayısıyla 0 olacak. İlk döngüde onla çarptığımız
        // zaman 10 lar basamağı değilde 1 ler basamağı elde etmek istiyoruz. o yüzden başlangıç değeri olarak 0 verdik.

        while (temp != 0) {
            sonBasamak = temp % 10; //son basamağı bulmak için sayının mod 10'nunu aldık. örnek 232 mod(10) = 2
            tersSayi = (tersSayi * 10) + sonBasamak;
            temp /= 10;
        }
        if(sayi == tersSayi){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(isPolindrome(232));
    }
}
