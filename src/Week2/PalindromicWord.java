package Week2;

import java.util.Scanner;

/*
    Java dilinde kullanıcının girdiği kelimenin "Palindromik" olup olmadığı bulan bir program yazıyoruz.
    Eğer bir kelimenin tersten okunuşu yine aynı kelimeyi veriyorsa o kelime "Palindromik Kelime'dir".
    Örnek : abba , asa , kavak, kayak
 */
public class PalindromicWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();

        int length = word.length();
        boolean isPalindrome = true;

        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Kelime palindromiktir.");
        } else {
            System.out.println("Kelime palindromik değildir.");
        }
    }
}

