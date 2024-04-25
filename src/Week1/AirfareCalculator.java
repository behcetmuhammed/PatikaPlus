package Week1;
import java.util.Scanner;

/*
    Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve
    yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın.
    İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

    Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. ,
    Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
    Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
    Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
    Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
    Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
*/
public class AirfareCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen mesafeyi KM cinsinden giriniz: ");
        double mesafe = input.nextDouble();
        System.out.print("Lütfen yolcunun yaşını giriniz: ");
        double yas = input.nextDouble();
        System.out.print("Lütfen yolculuk tipini giriniz giriniz (Tek yön => 1, Gidiş-Dönüş => 2): ");
        int yolculukTipi = input.nextInt();

        double kmUcreti = 0.10;
        double ucret, indirim = 0.0;

        ucret = mesafe * kmUcreti;

        if((yolculukTipi==1 || yolculukTipi ==2) && yas>= 0 && mesafe >= 0){
            if(yas<=12){
                indirim = ucret * 0.50;
            }
            else if(yas >= 12 && yas <= 24){
                indirim = ucret * 0.10;
            }
            else if(yas >= 65){
                indirim = ucret * 0.30;
            }
            ucret -= indirim;
            if(yolculukTipi == 2){
                ucret *= 2;
                indirim = ucret * 0.20;
                ucret -= indirim;
            }
            System.out.printf("Toplam ücret: %.1f TL\n", ucret+indirim);
            System.out.printf("Toplam indirim: %.1f TL\n", indirim);
            System.out.printf("İndirim sonrası ödenecek tutar: %.1f TL\n", ucret);
        } else {
            System.out.println("Hatalı Veri Girdiniz !\n");
        }
    }
}
