package Week5.FindingFrequentlyWord;

import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

/*
    Soru: Kullanıcı tarafından girilen bir metinde en çok geçen kelimeyi bulup ekrana yazdıran bir Java projesi yazınız.
 */
public class Main {

    public static void printArr(String[] arr) {
        for (String str : arr) {
            System.out.print(str + " ");
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Metin giriniz: ");
        //İnsan kalbinin bam teline basar en özel duyguları içtenlikle anlatır şiirler en özel özel
        String text = input.nextLine();

        String[] discreteText = text.split(" ");

        printArr(discreteText); //[İnsan, kalbinin, bam, teline, basar, en, özel, duyguları, içtenlikle, anlatır, şiirler]

        // Key: kelimeler...
        // Value: kelimenin metinde kaç kere geçtiği....
        HashMap<String, Integer> hashMapText = new HashMap<>();


        for (String word : discreteText) {
            hashMapText.put(word, hashMapText.getOrDefault(word, 0) + 1);
        }

        String mostFrequentWord = null;
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : hashMapText.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequentWord = entry.getKey();
            }
        }

        if (mostFrequentWord != null) {
            System.out.println("En çok geçen kelime: " + mostFrequentWord + " (" + maxCount + " kez)");
        } else {
            System.out.println("Metinde kelime bulunamadı.");
        }


    }
}
