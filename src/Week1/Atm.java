package Week1;

import java.util.Scanner;

/*
    ##Ödev
    Aynı projedeki ATM işlemlerini "Switch-Case" kullanarak yapınız.
*/
public class Atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kullaniciAdi = "Emir", kullaniciSifresi = "Emir123"; //kullancı adı ve şifremizi default değerlerini atadık.
        int sifreHakki = 3; // yanlış şifre hakkım 3
        int bakiye = 3000; // bakiyemiz 3000 TL
        int secim;

        while (sifreHakki != 0) {
            sifreHakki--;
            System.out.print("\nLütfen kullanıcı adını giriniz: ");
            kullaniciAdi = input.next();
            System.out.print("Lütfen şifrenizi giriniz: ");
            kullaniciSifresi = input.next();
            if (kullaniciAdi.equals("emir") && kullaniciSifresi.equals("emir123")) {

                //sifreHakki = 0; //eğer kullanıcı doğru şifreyi girerse şifre hakkı otomatik 0'lanır.

                do {
                    System.out.println(" 1- Para çek\n 2- Para yatır \n 3- Bakiye sorgula \n 4- Çıkış yap");
                    System.out.print("Hoşgeldiniz. Lütfen işlem türünü seçiniz: ");
                    secim = input.nextInt();
                    switch (secim) {
                        case 1:
                            System.out.print("Çekilecek miktarı girin: ");
                            int cekilenPara = input.nextInt();

                            if (cekilenPara < bakiye) {
                                bakiye -= cekilenPara;
                                System.out.println("İşlem başarılı. " + cekilenPara + " TL çekildi. Güncel bakiyen: " + bakiye + " TL");
                            } else {
                                System.out.println("Bakiyeniz yetersiz");
                                break;
                            }
                            break;
                        case 2:
                            System.out.print("Yatıralacak miktarı girin: ");
                            int yatirilanPara = input.nextInt();
                            bakiye += yatirilanPara;
                            System.out.println("İşlem başarılı. " + yatirilanPara + " TL yatırıldı. Güncel bakiyen: " + bakiye + " TL");
                            break;

                        case 3:
                            System.out.println("Bakiyeniz: " + bakiye + " TL");
                            break;
                    }
                } while (secim != 4);
                System.out.println("Çıkış yapıldı.");
                break;

            } else {
                System.out.println("Yanlış şifre! Kalan hakkınız: " + sifreHakki);
                if (sifreHakki == 0) {
                    System.out.println("\nÇok fazla yanlış şifre denemesi!. Sistem bloke oldu.");
                }
            }
        }
    }
}
