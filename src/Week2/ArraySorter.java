package Week2;
import java.util.Scanner;
import java.util.Random;
/*
    Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız. Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.

    ## Senaryo
    Dizinin boyutu n : 5
    Dizinin elemanlarını giriniz :
    1. Elemanı : 99
    2. Elemanı : -2
    3. Elemanı : -2121
    4. Elemanı : 1
    5. Elemanı : 0
    Sıralama : -2121 -2 0 1 99

 */

public class ArraySorter {
    //Diziye 1 ile 50 arası Random eleman atalım
    public static void randomValue(int[] arr, int length, int max) {//arr: diziyi alır, length: dizinin uzunuluğu alır, diziye 0 ile max arasında rastgele değerler verir
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(max);
        }
    }

    //Diziyi ekrana yazdırma
    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //Diziyi sıralama
    public static void sortArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }


    ////////////////////////////////////////   ANA METOD   ////////////////////////////////////////
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        //Önce dizinin boyutunu alalım..
        System.out.print("Dizinin boyutunu giriniz: ");
        int length = input.nextInt();

        //Diziyi oluşturalım..
        int[] arr = new int[length];
        //randomValue(arr, length, 50);

        //Diziyi erkrana yazdıralım
        //printArr(arr);

        //Diziyi sırayalım
        //sortArr(arr);

        //Sıralanmış diziyi erkrana yazdıralım
        //printArr(arr);



        //Eğer elemanları kendimiz gireceksek.. (Ödev de bunu istiyor)
        int[] arr2 = new int[length];
        int counter = 0;
        System.out.println("Dizinin elemanlarını giriniz :");
        for (int i = 0; i < length; i++) {
            System.out.print(i+1 + ". Elemanı: ");
            int n = input.nextInt();
            arr2[counter++] = n;
        }

        sortArr(arr2);
        System.out.print("Sıralama: ");
        printArr(arr2);
    }
}
