package Week1;

import java.util.Scanner;

public class Denemeler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mat, chem, phy, tur, music;

        System.out.print("Please Enter Your Mathematics Grade (0-100): ");
        mat = input.nextDouble();
        if (mat < 0 || mat > 100) {
            System.out.println("Invalid Mathematics Grade! Grade should be between 0 and 100.");
            return; // Geçersiz not olduğunda programın devam etmesini engelle
        }

        System.out.print("Please Enter Your Chemistry Grade: ");
        chem = input.nextDouble();

        System.out.print("Please Enter Your Physics Grade: ");
        phy = input.nextDouble();

        System.out.print("Please Enter Your Turkish Grade: ");
        tur = input.nextDouble();

        System.out.print("Please Enter Your Music Grade: ");
        music = input.nextDouble();

        // Matematik dersinin notu 0-100 arasında değilse, ortalama hesaplanmaz
        double average = 0.0;
        int n = 0;
        if (mat >= 0 && mat <= 100) {
            average += mat;
            n++;
        } else {
            System.out.println("Mathematics grade is invalid and not included in the calculation.");
        }
        if (chem >= 0 && chem <= 100) {
            average += chem;
            n++;
        }
        if (phy >= 0 && phy <= 100) {
            average += phy;
            n++;
        }
        if (tur >= 0 && tur <= 100) {
            average += tur;
            n++;
        }
        if (music >= 0 && music <= 100) {
            average += music;
            n++;
        }

        // Eğer hiç geçerli not girilmediyse, ortalama hesaplanamaz
        if (n == 0) {
            System.out.println("There are no valid grades entered.");
            return;
        }

        // Ortalama hesaplanır ve ekrana yazdırılır
        average /= n;
        System.out.println("Your Grade Average: " + average);

        // Sınıfı geçme kontrolü yapılır
        if (average >= 55) {
            System.out.println("Congratulations! You Passed the Class!");
        } else {
            System.out.println("You Failed the Class!");
        }
    }
}
