package Week1;
/*
Taksimetre Programı
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.
*/
import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Gidilen KM'yi Giriniz: ");
        double km = input.nextDouble();
        double startPrice= 10, priceKm = 2.20 ,price = km * priceKm;
        if (price >= 20) {
            price = startPrice + (km * 2.20);
        }
        else {
            price = 20;
        }
        String priceV = String.format("%.0f", price);
        System.out.println("Taksimetre Tutarı: " + priceV);
    }
}
