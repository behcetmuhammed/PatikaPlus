package Week2;
import java.util.Arrays;

public class Denemeler {
    public static void modifyValue(int a) {
        a = 20;
        System.out.println("Inside modifyValue method: " + a);
    }

    public static void main(String[] args) {
        int x = 10;

        Denemeler exx = new Denemeler();
        exx.modifyValue(x);
    }
}
