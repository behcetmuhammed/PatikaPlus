package Week2;
import java.util.Random;
// - İstediğiniz boyutta matris oluşturarak matris değerlerine 0-99 arası random sayılar üreterek matrise atama yapınız.

public class MatrixExample2 {
    public static void main(String[] args) {
        Random ex = new Random();

        int[] matris = new int[10];
        for (int i = 0; i <matris.length ; i++) {
            int rastgeleSayi = ex.nextInt(100);
            matris[i] = rastgeleSayi;
        }
        for (int i = 0; i < matris.length; i++) {
            System.out.print(matris[i] + " ");
        }
    }
}
