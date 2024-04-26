package Week1;
import java.util.Scanner;
/*
    Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.
    Örnek: Girilen sayı 10 => ekran da 1, 2, 4, 8 yazacak

    ##Ödev
    Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
*/
public class PowersOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayi giriniz: ");
        int n = input.nextInt();
        int k = 0, t = 0;

        for(int i = 1 ; i<n ; i *= 4){
            System.out.println("4'ün " + k + ". kuvveti: " + i);
            k++;
        }
        for(int i = 1 ; i<n ; i *= 5){
            System.out.println("5'in " + t + ". kuvveti: " + i);
            t++;
        }

       /* System.out.print("Sayi giriniz: ");
        int n = input.nextInt();
        int k = 0;

        for(int i = 1 ; i<n ; i *= 2){
            System.out.println("2'nin " + k + ". kuvveti: " + i);
            k++;
        }*/
    }
}
