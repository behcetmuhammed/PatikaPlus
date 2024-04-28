package Week1;
import java.util.Scanner;
/*
    Soru: Java'da tip dönüşümlerini anlamak için bir program yazınız. Bu program, öncelikle kullanıcıdan bir tam sayı
    ve bir ondalıklı sayı girmesini istesin. Daha sonra bu tam sayıyı ondalıklı sayıya dönüştürerek ve bu ondalıklı
    sayıyı tam sayıya dönüştürerek sonuçları ekrana yazdırsın.

    İpucu 1: Kullanıcıdan giriş almak için Scanner sınıfını kullanabilirsiniz.

    İpucu 2: Tip dönüşümü yapmak için, dönüştürmek istediğiniz tipi parantez içinde öne koyabilirsiniz.
    Örneğin, double tipindeki bir değişkeni int tipine dönüştürmek için (int) ifadesini kullanabilirsiniz.

    İpucu 3: Tam sayıları ondalıklı sayılara dönüştürdüğünüzde, virgülden sonra her zaman .0 olacaktır.
    Örneğin, 5 tam sayısını double tipine dönüştürdüğünüzde sonuç 5.0 olacaktır.

    İpucu 4: Ondalıklı sayıları tam sayılara dönüştürdüğünüzde, virgülden sonraki kısmı kaybedersiniz.
    Örneğin, 5.99 ondalıklı sayısını int tipine dönüştürdüğünüzde sonuç 5 olacaktır.

    Bu ipuçlarını kullanarak, Java'da tip dönüşümlerini uygulamalı bir şekilde gösteren bir program yazabilirsiniz. Bol şanslar!
 */
public class PracticalAssignments2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir tam sayı giriniz: ");
        int tamSayi = input.nextInt();
        System.out.print("Bir ondalıklı sayı giriniz: ");
        double ondalikliSayi = input.nextDouble();

        double tamSayiV = (double) tamSayi;
        int ondalikliSayiV = (int) ondalikliSayi;

        System.out.println("Double sayıdan Tam sayı ya dönüştürlen sayı: " + ondalikliSayiV);
        System.out.println("Tam sayıdan dan double sayı ya dönüştürlen sayı: " + tamSayiV);

    }
}
