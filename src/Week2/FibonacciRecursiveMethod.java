package Week2;

/*
    Java'da recursive metotlar ile fibonacci serisi bulan program yapıyoruz.
    Fibonacci serisi: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, …
 */
public class FibonacciRecursiveMethod {
    static int FibonacciSeries(int n) {
        if (n <= 1) {
            return n;
        }
        return FibonacciSeries(n - 1) + FibonacciSeries(n - 2);
    }

    public static void main(String[] args) {
        int limit = 10; // limit değeri
        for (int i = 0; i < limit; i++) {
            System.out.print(FibonacciSeries(i) + " ");
        }
    }
}
