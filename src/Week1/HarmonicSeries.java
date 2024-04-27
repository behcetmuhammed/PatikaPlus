package Week1;
import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("n sayısını giriniz: ");
        int n = input.nextInt();

        double result = 0.0; //kesir olduğu için double türünde tanımladık
        for (double i = 1; i < n+1; i++) { //kesir olduğu için double türünde tanımladık
            result += 1/i;
        }
        System.out.printf("Sonuç: %.2f", result); //%.2f => çıkan sonuçta virgülden sonra sadece 2 basamak göster demek
    }
}
