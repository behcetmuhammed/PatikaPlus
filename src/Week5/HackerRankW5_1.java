package Week5;

/*
(5)

5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33

--------------

(5)

1 3     => 74
3 4     => 52
3 1     => 37
4 3     => ERROR!
5 5     => ERROR!

n: satır sayısı
d: satırda bulunan elamanların sayısı
q: kaç tane sorgu olduğunu belirtir.

 */
import java.util.ArrayList;
import java.util.Scanner;

public class HackerRankW5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        ArrayList<ArrayList<Integer>> listOfLists = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int d = scanner.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                list.add(scanner.nextInt());
            }
            listOfLists.add(list);
        }

        // Sorgu sayısını al
        int q = scanner.nextInt();

        // Sorguları işle
        for (int i = 0; i < q; i++) {
            int x = scanner.nextInt(); //satır
            int y = scanner.nextInt(); //sütın

            // x ve y indekslerinin geçerli olup olmadığını kontrol et
            if (x < listOfLists.size() && y < listOfLists.get(x).size()) {
                System.out.println(listOfLists.get(x).get(y));
            } else {
                System.out.println("ERROR!");
            }
        }

        scanner.close();
    }
}
