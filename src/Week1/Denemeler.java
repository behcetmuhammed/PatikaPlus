package Week1;
import java.util.Scanner;
/*
    ## Ödev
    Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız. 
*/
public class Denemeler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("n1 sayısını giriniz: ");
        int n1 = input.nextInt();
        System.out.print("n2 sayısını giriniz: ");
        int n2 = input.nextInt();

        int ebob = 0;
        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
        }
        System.out.println(n1 + " ve " + n2 + " sayılarının Ebob'u: " + ebob);

        //1. Yöntem
        //System.out.println(n1 + " ve " + n2 + " sayılarının Ekok'u: " + ((n1 * n2) / ebob));

        //2. Yöntem
        int okek = 0;
        for (int i = 1; i < n1 * n2; i++) {
            if (i % n1 == 0 & i % n2 == 0) {
                okek = i;
                break;
            }
        }
        System.out.println(n1 + " ve " + n2 + " sayılarının Ekok'u: " + okek);
    }
}
