package Week1;

import java.util.Scanner;
/*
Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav
puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
*************
Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması
60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
Not: Ternary Operator ya da Switch Case kullanarak yapılacak.
*/
public class NotOrtalamasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik sonucunu giriniz: ");
        double Matematik = input.nextDouble();
        System.out.print("Fizik sonucunu giriniz: ");
        double Fizik = input.nextDouble();
        System.out.print("Kimya sonucunu giriniz: ");
        double Kimya = input.nextDouble();
        System.out.print("Türkçe sonucunu giriniz: ");
        double Türkçe = input.nextDouble();
        System.out.print("Tarih sonucunu giriniz: ");
        double Tarih = input.nextDouble();
        System.out.print("Müzik sonucunu giriniz: ");
        double Müzik = input.nextDouble();

        double ortalama = (Matematik + Kimya + Fizik + Türkçe + Tarih + Müzik) / 6;

        System.out.println("Not Ortalamanız: " + ortalama);

            /*
            if (ortalama >= 60){
                System.out.println("Sınıfı geçti");
            }
            else{
                System.out.println("Sınıfta Kaldı");
            }
             */
        //veya
        String durum = (ortalama >= 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(durum);
    }
}