package Week5;

import java.util.Scanner;

/*
    Soru: 10 elemanlı tek boyutlu bir dizi içerisinde kullanıcıdan alınan indeksteki elemanı döndüren bir Java metodu yazın.
    Eğer belirtilen indeks dizi boyutunun dışındaysa, metot bir hata mesajı döndürmelidir. Dizinin elmanlarını manuel olarak tanımlayın.
 */
public class PracticalTryCatchBlog {

    public static void printElementAtIndex(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            throw new RuntimeException("Belirtilen indeks dizi boyutunun dışında.");
        }
        System.out.println(arr[index]);
    }

    public static void main(String[] args) {
        System.out.println("Başlangıç!");
        Scanner input = new Scanner(System.in);
        System.out.print("Dizide aramak istediğiniz indeksi girin: ");
        int numIndex = input.nextInt();

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        try {
            printElementAtIndex(arr, numIndex);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println("Bitiş!");
        }
    }
}

