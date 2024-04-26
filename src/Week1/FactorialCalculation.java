package Week1;

import java.util.Scanner;
/*
    ##Ödev

    N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu
    olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

    Java ile kombinasyon hesaplayan program yazınız.
    Kombinasyon formülü
    C(n,r) = n! / (r! * (n-r)!)
 */
public class FactorialCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("n değerini giriniz: ");
        int n = input.nextInt(); //kullanıcdan n değerini aldık
        System.out.print("r değerini giriniz: ");
        int r = input.nextInt(); //kullanıcdan r değerini aldık

        int toplamN = 1, toplamR = 1, toplamZ = 1; //faktöryel toplamlarını bu değişkenlere atayacağız. şimdilik bunların değeri1 olsun dedik
        if ((n > 0) && (r > 0)) { //eğer kullanıcı 0 dan küçük değer girerse farktöriyel işlemi yapılamayağı için girilen değerleri kontrol ettik
            for (int i = n; i > 0; i--) {
                toplamN *= i; // faktöriyel hesaplama işlemi
            }
            System.out.println(n + " sayısının faktöryeli: " + toplamN); //toplamN n! temsil ediyor

            for (int i = r; i > 0; i--) {
                toplamR *= i; // faktöriyel hesaplama işlemi
            }
            System.out.println(r + " sayısının faktöryeli: " + toplamR); //toplamN r! temsil ediyor

            int z = n-r; // burada z formüldeki n-r 'yi temsil ediyor. n-r! ise toplamZ temsil ediyor
            for (int i = z; i > 0; i--) {
                toplamZ *= i; // faktöriyel hesaplama işlemi
            }
            System.out.println(z + " sayısının faktöryeli: " + toplamZ);

        } else {
            System.out.println("Geçersiz sayı!"); ////eğer kullanıcı 0 dan küçük değer girerse..
        }

        // C(n,r) = n! / (r! * (n-r)!)
        // z burada n-r 'yi temsil ediyor
        int Kombinasyon = toplamN / (toplamR * (toplamZ));
        System.out.println("Kombinasyon sonucu: " + Kombinasyon);

        /*
        System.out.print("Faktöriyeli hesaplanacak sayıyı giriniz: ");
        int t = input.nextInt();
        int toplam = 1;
        //4 => 4*3*2*1 = 24
        if (t > 0) {
            for (int i = t; i > 0; i--) {
                toplam *= i;
            }
            System.out.println(t +" sayısının faktöryeli: " +toplam);
        } else {
            System.out.println("Geçersiz sayı!");
        }
        */

    }
}
