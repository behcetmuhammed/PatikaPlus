package Week1;
/*
    Pratik - Aritmetik İşlemler ve İşlem Önceliği
    Soru: Kullanıcıdan 3 tane sayı (a, b, c) alıp bu sayıları işlem sırasına göre işleyen bir program yazın.
    İşlem sırası şöyle olsun: a+b*c-b. İşlem tamamladıktan sonra sonucu ekrana yazdırın.

    Örnek: Kullanıcıdan alınan sayılar 10, 2 ve 3 olsun. Yapılacak işlem ise 10+2*3-2 şeklinde olsun.
    İşlemleri kullanıcı girmeyecek olup kodunuzda yazmış olmalısınız.

    İpucu 1: Kullanıcıdan veri almak için `Scanner` sınıfını kullanabilirsiniz.
    İpucu 2: Sonucu ekrana yazdırmak için `System.out.println()` metodunu kullanabilirsiniz.

    Bol şanslar!
*/
import java.util.Scanner;
public class PracticalAssignments1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a sayısını giriniz: ");
        int a = input.nextInt();
        System.out.print("b sayısını giriniz: ");
        int b = input.nextInt();
        System.out.print("c sayısını giriniz: ");
        int c = input.nextInt();
        int result = a+b*c-b;
        System.out.println("Sonuç: "+result);
    }
}
