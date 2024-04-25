package Week1;
/*
    Vücut Kitle İndeksi Hesaplama
    Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre
    kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

    Formül:
    Kilo (kg) / Boy(m) * Boy(m)
*/
import java.util.Scanner;
public class KitleIndeks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Boyunuzu Giriniz:");
        double boy = input.nextDouble();
        System.out.print("Lütfen Kilonuzu Giriniz:");
        double kilo = input.nextDouble();
        double kitleİndeksi = kilo / (boy*boy);
        String kitleİndeksiV = String.format("%.0f", kitleİndeksi);
        System.out.println("Vücut Kitle İndeksiniz: "+ kitleİndeksiV);
    }
}
