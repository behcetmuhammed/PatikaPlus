package Week2;


import java.util.Scanner;

// Matris boyutunu sizin belirlediğiniz matris değerlerini ise kullanıcının girdiği bir algoritma yazınız.

public class MatrixExample1 {
    public static void main(String[] args) {
        int [][] matrisEmir = new int[3][4]; //3 satır, 4 sütun

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < matrisEmir.length; i++) {
            for (int j = 0; j < matrisEmir[0].length; j++) {
                System.out.print("Matris "+ i + " "+ j + " için bir değer girin: ");
                matrisEmir[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i <matrisEmir.length; i++) {
            for (int j = 0; j <matrisEmir[0].length; j++) {
                System.out.print(matrisEmir[i][j] + " ");
            }
            System.out.println();
        }
    }
}