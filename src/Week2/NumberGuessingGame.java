package Week2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
    Java dilinde programın 0-100 arasında rastgele seçtiği bir sayıyı kullanıcının
    tahmin etmesini istediğimiz bir "Sayı Tahmin Oyunu" yapıyoruz.
 */
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.println("==========================================\n==== Sayı Tahmin Oyununa Hoşgeldiniz! ====\n==========================================");
        System.out.print("Kaç tahmin hakkınız olsun: ");
        int rightGuess = input.nextInt();

        int realNum = random.nextInt(100);
        int remainingRight = 0; //kalan hak
        int[] wrongChoices = new int[rightGuess];
        Boolean isWin = false;
        Boolean isWrong = false;

        //System.out.println("xxx: " + realNum);

        while (remainingRight < rightGuess) {
            System.out.print("0 ile 100 arasında bir sayı girin: ");
            int selectedNum = input.nextInt();

            if (selectedNum < 0 || selectedNum > 100) {
                System.out.println("Yanlış bir sayı girdiniz. Lütfen 1-99 arasında bir sayı giriniz.");
                if (isWrong) {
                    remainingRight++;
                    System.out.println("Çok fazla hatalı giriş yaptınız.. Kalan hakkınız: " + (rightGuess-remainingRight));
                } else {
                    System.out.println("Bir daha hatalı girişinde hakkınızdan düşülecektir");
                    isWrong = true;
                }
                continue;
            }
            if (selectedNum == realNum) {
                System.out.println("Tebrikler! Oyunu kazandınız. Seçtiğiniz sayı: " + selectedNum);
                isWin = true;
                break;
            } else {
                wrongChoices[remainingRight] = selectedNum;

                System.out.println("Yanlış tahmin! Kalan tahmin hakkınız: " + ((rightGuess - 1) - remainingRight)); // rightGuess - 1: 0 da dahil olduğu için...
                if (selectedNum > realNum) {
                    System.out.println("Seçtiğiniz sayı gerçek sayıdan büyük!");
                } else {
                    System.out.println("Seçtiğiniz sayı gerçek sayıdan küçük!");
                }
            }
            remainingRight++;
        }
        if (!isWin) {
            System.out.println("Yanlış tahminler: " + Arrays.toString(wrongChoices) + ", Aranan sayı: " + realNum);
        }



    }
}
