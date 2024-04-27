package Week1;
import java.util.Scanner;
public class TriangleWithDiamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Yıldız Sayısını giriniz: ");
        int n = input.nextInt();

        // Üçgenin oluşturulması
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // Ters üçgenin oluşturulması
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < (n - i); j++) {        // boşluk sayısını veren algoritma
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {   // yıldızları yazan algoritma
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
