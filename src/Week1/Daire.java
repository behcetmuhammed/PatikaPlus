package Week1;
/*
    Dairenin Alanını ve Çevresini Hesaplayan Program
    Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
    Alan Formülü : π * r * r;
    Çevre Formülü : 2 * π * r;
##Ödev
    Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
    𝜋 sayısını = 3.14 alınız.
    Formül : (𝜋 * (r*r) * 𝛼) / 360
*/
import java.util.Scanner;
public class Daire {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        double pi = 3.14;
        System.out.print("Lütfen Yarı Çapı Giriniz: ");
        double r = input.nextDouble();
        System.out.print("Lütfen Merkez Açısının Ölçüsünü Giriniz: ");
        double alpha = input.nextDouble();

        double alan = pi*r*r;
        double cevre = 2*pi*r;
        double dilimAlan = (pi * (r*r) * alpha) / 360;
        System.out.println("Üçgenin Alanı: " + alan);
        System.out.println("Üçgenin Çevresi: " + cevre);
        System.out.println("Daire Diliminin Alanı: " + dilimAlan);
    }
}
