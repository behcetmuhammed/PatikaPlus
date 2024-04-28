package Week1;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci serisinin başlangıç değerlerini giriniz: ");
        int sayi1 = input.nextInt();
        System.out.print("İkinci sayı: ");
        int sayi2 = input.nextInt();

        System.out.println("Fibonacci serisinin kaç elemanını görmek istiyorsunuz?");
        int limit = input.nextInt();

        System.out.println("Fibonacci serisi:");
        System.out.println(sayi1);  // fibonnacinin ilk değerini yazdırdık.
        System.out.println(sayi2);  // fibonnacinin ikinci değerini yazdırdık.
        int toplam = 0;
        for (int i = 0; i < limit; i++) {
            toplam = sayi1 + sayi2;
            System.out.println(toplam); // fibonnacinin sonraki değerlerini yazdırdık.
            sayi1 = sayi2;
            sayi2 = toplam;
            if(toplam>limit){ //fibonnaci serisini durdurma limiti
                break;
            }
        }
        // Girilen sayılardan fibonacci!!! düşün bunu
    }
}
