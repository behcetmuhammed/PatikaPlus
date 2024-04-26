package Week1;
import java.util.Scanner;
/*
    Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı yazıyoruz.

    ### Ödev
    Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
*/

public class ExponentialNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Taban sayıyı giriniz: ");
        int taban = input.nextInt();
        System.out.print("Üs sayısını giriniz: ");
        int us = input.nextInt();

        int sonuc = 1;
        for(int i=0; i<us ; i++){
            sonuc *= taban;
        }
        System.out.println(taban + "^" + us+ " işleminin sonucu: " + sonuc);
    }
}
