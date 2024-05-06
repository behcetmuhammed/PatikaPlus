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
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}