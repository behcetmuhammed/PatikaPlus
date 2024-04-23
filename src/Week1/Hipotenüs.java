package Week1;
/*
* Dik Üçgende Hipotenüs Bulan Program
Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

##Ödev
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
Formül:
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
𝑢 = (a+b+c) / 2
Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
*/

import java.util.Scanner;
public class Hipotenüs {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.print("Lütfen 1. Kenarın Uzunluğunu Giriniz: ");
        int kenar1 = input.nextInt();
        System.out.print("Lütfen 2. Kenarın Uzunluğunu Giriniz: ");
        int kenar2 = input.nextInt();
        System.out.print("Lütfen 3. Kenarın Uzunluğunu Giriniz: ");
        int kenar3 = input.nextInt();
/*
        double hipotenüs = Math.sqrt((kenar1*kenar1) + (kenar2*kenar2));
        String hipotenüsV = String.format("%.0f", hipotenüs); // Virgülden sonra bir basamaklı olarak formatla
        System.out.println("Hipotenüs = " + hipotenüsV);
*/
        int u = (kenar1+kenar2+kenar3)/2;
        double alan = Math.sqrt((u)*(u-kenar1)*(u-kenar2)*(u-kenar3));
        String alanV = String.format("%.0f", alan);
        System.out.println("Üçgenin Alanı: " + alanV);
    }
}
