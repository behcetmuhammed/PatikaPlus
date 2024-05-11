package Week2;

import java.util.Arrays;
import java.util.Scanner;

public class Denemeler {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[][] arr = {{"*", "-", "-", "*", "-"},
                {"-", "-", "*", "-", "-"},
                {"-", "-", "*", "-", "-"},
                {"-", "*", "-", "-", "-"},
                {"-", "-", "*", "-", "-"}};


        for ( String[] row: arr) {
            for ( String col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

    }
}
