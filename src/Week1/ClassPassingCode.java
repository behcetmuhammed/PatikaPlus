package Week1;
import java.util.Scanner;
/*
    Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
    Geçme Notu : 55

    ##Ödev
    Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
*/
public class ClassPassingCode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = 0;
        double average = 0.0;

        System.out.print("Please Enter Your Mathematics Grade: ");
        double mat = input.nextDouble();
        if (0<=mat && mat<=100) {
            average += mat;
            n++;
        }
        else{
            System.out.println("Invalid Mathematics Grade! Grade should be between 0 and 100.");
        }

        System.out.print("Please Enter Your Chemistry Grade: ");
        double chem = input.nextDouble();
        if (0<=chem && chem<=100) {
            average += chem;
            n++;
        }
        else{
            System.out.println("Invalid Chemistry Grade! Grade should be between 0 and 100.");
        }

        System.out.print("Please Enter Your Physics Grade: ");
        double phy = input.nextDouble();
        if (0<=phy && phy<=100) {
            average += phy;
            n++;
        }
        else{
            System.out.println("Invalid Physics Grade! Grade should be between 0 and 100.");
        }

        System.out.print("Please Enter Your Turkish Grade: ");
        double tur = input.nextDouble();
        if (0<=tur && tur<=100) {
            average += tur;
            n++;
        }else{
            System.out.println("Invalid Turkish Grade! Grade should be between 0 and 100.");
        }

        System.out.print("Please Enter Your Music Grade: ");
        double music = input.nextDouble();
        if (0<=music && music<=100) {
            average += tur;
            n++;
        }else{
            System.out.println("Invalid Music Grade! Grade should be between 0 and 100.");
        }

        double totalAverage = average/n;
        System.out.println("Number of lessons: " + n);
        System.out.println("Your Grade Average: " + totalAverage);

        if (average >= 55) {
            System.out.println("Congratulations! You Passed the Class!");
        } else {
            System.out.println("You Failed the Class!");
        }
    }
}
