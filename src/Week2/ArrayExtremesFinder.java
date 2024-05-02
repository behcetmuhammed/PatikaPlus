package Week2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class ArrayExtremesFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Dizinin boyutunu giriniz: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(100); //0 ile 100 arasında rastgele sayı alan bir dizi oluşturduk.
        }
        //Oluşan diziyi ekrana yazdıralım:
        System.out.print("Dizi elemanları: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ", ");
        }

        //  3 yolla yapabiliriz:

        //1. YOL:  Arrays kütüphanesini kullanmak..
        /*
        Arrays.sort(arr);
        System.out.println("\nSıralı: "+Arrays.toString(arr));
        System.out.println("En küçük eleman: " + arr[0] + ", En büyük eleman: " + arr[n-1]);
        */


        //2. YOL: Önce kendimiz sıralama algoritmasını yazarız daha sonra min. ve max. elemanlarını rahatça buluruz.
        /*
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        //Oluşan diziyi ekrana yazdıralım:
        System.out.print("\nDizi elemanları: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("\nEn küçük eleman: " + arr[0] + ", En büyük eleman: " + arr[n-1]);
        */

        //3. YOL: Dizi elemanlarını teker teker kontrol ederek en büyük ve en küçük elemanları bulabiliriz.
        /*
        int min = arr[0]; //dizinin en küçük elemanını default olarak dizinin 0. indexi olarak belirledik
        int max = arr[0]; //dizinin en büyük elemanını da default olarak dizinin 0. indexi olarak belirledik
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("\nEn küçük eleman: " + min + ", En büyük eleman: " + max);
         */

        // ####################   Ödev kısmı:   ####################

        /*
        ### Ödev
         Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.

         Dizi : {15,12,788,1,-1,-778,2,0}
         Girilen Sayı : 5
         Girilen sayıdan küçük en yakın sayı : 2
         Girilen sayıdan büyük en yakın sayı : 12
         */

        // 1. YOL (Kısa yol)

        //şimdi istenen işlemleri yapalım..
        System.out.print("\nEn yakın sayıyı ve en büyük en yakın sayıyı bulmak için bir sayı girin: ");
        int sayi = input.nextInt();

        int smaller = Integer.MIN_VALUE; //smaller Int veri türünün alabileceği en küçük değere eşitledik yani smaller = -2147483648
        int larger = Integer.MAX_VALUE; //smaller Int veri türünün alabileceği en büyük değere eşitledik yani smaller = +2147483647

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < sayi && arr[i] > smaller) {
                smaller = arr[i];
            } else if (arr[i] > sayi && arr[i] < larger) {
                larger = arr[i];
            }
        }
        System.out.println("Girilen Sayı: " + sayi);
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + (smaller != Integer.MIN_VALUE ? smaller : "YOK"));
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + (larger != Integer.MAX_VALUE ? larger : "YOK"));

        //Kodlama bittikten sonra başka bir sınıfta metod tanımla.. kod kalabalıklığı olmasın..


        //2. YOL (Uzun yol)
        /*
        //Önce Diziyi sıralayalım böylece istediğimiz sonuca daha kolay ulaşırız..
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        //Sonra oluşan diziyi ekrana yazdıralım..
        System.out.print("\nDizi elemanları: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ", ");
        }

        //şimdi istenen işlemleri yapalım..
        System.out.print("\nEn yakın sayıyı ve en büyük en yakın sayıyı bulmak için bir sayı girin: ");
        int sayi = input.nextInt();

        int counter = 0, ss = 0;
        boolean isPrint = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == sayi) {   //eğer sayi dizide varsa
                //eğer istenilen sayı ilk veya son indexde olursa hata alıcağız. Bu durumu çözmek için ekstra kontroller yapalım..
                if (sayi == arr[0]) {
                    System.out.println("\nGirilen " + sayi + " değerine en yakın küçük eleman: YOK, en yakın büyük eleman: " + arr[i + 1]);
                } else if (sayi == arr[n - 1]) {
                    System.out.println("\nGirilen " + sayi + " değerine en yakın küçük eleman: " + arr[i - 1] + ", en yakın büyük eleman: YOK");
                } else {
                    System.out.println("\nGirilen " + sayi + " değerine en yakın küçük eleman: " + arr[i - 1] + ", en yakın büyük eleman: " + arr[i + 1]);
                }
            } else if (arr[i] != sayi) {  //eğer sayi dizide yoksa
                for (int j = 0; j < n; j++) {
                    if (sayi > arr[j]) {
                        counter++;
                    }
                    isPrint = true;
                }
            }
        }
        int counterT = counter / 10;
        if (isPrint) {
            System.out.println("Girilen " + sayi + " değerine en yakın küçük eleman: " + arr[counterT - 1]);
            System.out.println("Girilen " + sayi + " değerine en yakın büyük eleman: " + arr[counterT]);
        }*/

    }
}
