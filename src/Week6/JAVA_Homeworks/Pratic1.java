package Week6.JAVA_Homeworks;

import java.io.*;

public class Pratic1 {
    public static void main(String[] args) {

        String data = "5\n10\n20\n12\n33\n";

        try {
            // Yazma
            FileWriter fWriter = new FileWriter("Patika2.txt", false);
            BufferedWriter bWriter = new BufferedWriter(fWriter);
            bWriter.write(data);  // bWriter ile veri yazıyoruz
            bWriter.close();

            // Okuma
            FileReader fReader = new FileReader("Patika2.txt");
            BufferedReader bReader = new BufferedReader(fReader);
            String line;
            int sum = 0;  //toplama
            while ((line = bReader.readLine()) != null) {
                try {
                    int number = Integer.parseInt(line); //String değerleri INT çevirdik
                    sum += number;
                    System.out.println("Read number: " + number);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.println("Sum result = " + sum);
            bReader.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
