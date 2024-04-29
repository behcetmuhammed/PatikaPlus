package Week2;
import java.util.Scanner;
/*
    Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.
    Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. Her çıkarma işlemi sırasında
    ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. Yine her ekleme işleminde sayının
    son değerini ekrana yazdırın.

    ## Senaryolar:
    N Sayısı : 16
    Çıktısı : 16 11 6 1 -4 1 6 11 16
    N Sayısı : 10
    Çıktısı : 10 5 0 5 10
    N Sayısı : 25
    Çıktısı : 25 20 15 10 5 0 5 10 15 20 25
    N Sayısı : 5
    Çıktısı : 5 0 5
*/
public class RecursiveNumberManipulator {
    //Örnek senaryo: 17  >  12  >  7  >  2  >  -3  >  2  >  7  >  12  >  17
    static int manipulateNumber(int sayi) {
        System.out.print(sayi + " "); //ilk sayıyı yazmak için...
        // sayı negatif veya 0 ise işlemi sonlandır
        if (sayi <= 0){
            return sayi;
        }
        manipulateNumber(sayi - 5);
        // Son değeri yazdır
        System.out.print(sayi + " ");
        return sayi;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = input.nextInt();

        manipulateNumber(sayi);

    }
}
