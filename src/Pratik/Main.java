import java.util.*;
import java.io.*;

class Main {

    public static String WordCount(String str) {

        String[] arr = str.trim().split("\\s+");
        int wordCount = arr.length;

        return String.valueOf(wordCount);
    }

    public static void main (String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print(WordCount(s.nextLine()));
    }

}
