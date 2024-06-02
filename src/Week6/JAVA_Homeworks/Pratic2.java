package Week6.JAVA_Homeworks;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Pratic2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir metin girin: ");
        String data = input.nextLine();

        try {
            //Yazma
            FileWriter fWriter = new FileWriter("Emir.txt", true);
            BufferedWriter bWriter = new BufferedWriter(fWriter);
            bWriter.write(data);
            bWriter.close();
            //Okuma
            FileReader fReader = new FileReader("Emir.txt");
            BufferedReader bReader = new BufferedReader(fReader);
            String line;
            while ((line = bReader.readLine()) != null) {
                try {
                    System.out.println(line);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.print(" "); //her yeni yazmada boşluk bırakmak için...
    }
}
