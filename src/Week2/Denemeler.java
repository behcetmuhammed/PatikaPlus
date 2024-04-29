package Week2;

public class Denemeler {
    public static void main(String[] args) {
        int sayi = 5;

        int fact = 1;
        for (int i = sayi; i > 0; i--) {
            fact *= i;
        }
        System.out.println("Faktöriyel sonucu: " + fact);
    }
}
