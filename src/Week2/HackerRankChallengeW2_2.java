package Week2;

import java.util.*;

public class HackerRankChallengeW2_2 {

    public static boolean canWin(int leap, int[] game) {
        return canWinHelper(leap, game, 0);
    }

    private static boolean canWinHelper(int leap, int[] game, int position) {
        if (position < 0 || game[position] == 1) {
            return false;
        }
        if (position == game.length - 1 || position + leap >= game.length) {
            return true;
        }
        game[position] = 1;
        return canWinHelper(leap, game, position + leap) ||
                canWinHelper(leap, game, position + 1) ||
                canWinHelper(leap, game, position - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sorgu (q) sayısı gir: ");
        int q = input.nextInt();

        while (q > 0) {
            System.out.print("Dizinin uzunluğunu gir gir: ");
            int n = input.nextInt();

            System.out.print("Sıçrama (atlama) sayısı gir: ");
            int leap = input.nextInt();

            int[] game = new int[n]; //n uzunluğunda bir dizi oluşturduk
            for (int i = 0; i < n; i++) {
                System.out.print("\nDizinin " +(i+1) + ". elemanına 0 ile 1 arasında bir sayı gir: ");
                game[i] = input.nextInt();
            }
            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
            q--;
        }
    }
}