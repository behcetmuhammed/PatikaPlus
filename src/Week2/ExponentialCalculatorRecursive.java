package Week2;
import java.util.Scanner;
/*
    Recursive Metotlar ile Üslü Sayı Hesaplama
    Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak yapan programı yazınız.

    ## Senaryo
    Taban değeri giriniz :2
    Üs değerini giriniz : 0
    Sonuç : 1
    Taban değeri giriniz : 2
    Üs değerini giriniz : 3
    Sonuç : 8
    Taban değeri giriniz : 5
    Üs değerini giriniz : 3
    Sonuç : 125
 */
public class ExponentialCalculatorRecursive {

    static int exponentialProcess(int taban, int us){
        if (us == 0) // us sıfırsa değer herzaman bir döndür
            return 1;
        else if (us > 0)
            return taban * exponentialProcess(taban, us - 1);
        else
            return 1 / (taban * exponentialProcess(taban, -us - 1)); // Negatif üs girilirse eğer..
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Taban değeri giriniz: ");
        int tabanDeger = input.nextInt();
        System.out.print("Üs değeri giriniz: ");
        int usDeger = input.nextInt();

        int sonuc = exponentialProcess(tabanDeger, usDeger);
        System.out.println("Sonuç: " + sonuc);
    }
}

