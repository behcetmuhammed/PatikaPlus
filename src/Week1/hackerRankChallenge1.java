package Week1;

import java.util.*;
import java.io.*;

/*
    byte > short > int > long

    Bir byte, 8 bitlik işaretli bir tamsayıdır.
    Bir short, 16 bitlik işaretli bir tamsayıdır.
    Bir int, 32 bitlik işaretli bir tamsayıdır.
    Bir long, 64 bitlik işaretli bir tamsayıdır.
*/

public class hackerRankChallenge1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Sayı Adedini Giriniz: ");
        int t = input.nextInt();

        for (int i = 0; i < t; i++) {
            try {
                /*
                byte: -128 ile 127 arasındaki değerler
                short: -32768 ile 32767 arasındaki değerler
                int: -2147483648 ile 2147483647 arasındaki değerler
                long: -9223372036854775808 ile 9223372036854775807 arasındaki değerler
                */
                System.out.print("Kontrol Ediliecek Sayıyı Giriniz: ");
                long x = input.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127){
                    System.out.println("* byte");
                }
                if (x >= -32768  && x <= 32767){
                    System.out.println("* short");
                }
                if (x >= -2147483648  && x <= 2147483647){
                    System.out.println("* int");
                }
                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(input.next() + " can't be fitted anywhere.");
            }

        }
    }
}



