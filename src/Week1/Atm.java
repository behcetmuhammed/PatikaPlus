package Week1;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kullaniciAdi = "Emir", kullaniciSifresi = "Emir123"; //kullancı adı ve şifremizi default değerlerini atadık.
        int sifreHakki = 3; // yanlış şifre hakkım 3
        int bakiye = 3000; // bakiyemiz 3000 TL
        int secim;

        while (sifreHakki != 0) {
            sifreHakki--;
            System.out.print("Lütfen kullanıcı adını giriniz: ");
            kullaniciAdi = input.next();
            System.out.print("Lütfen şifrenizi giriniz: ");
            kullaniciSifresi = input.next();
            if (kullaniciAdi.equals("emir") && kullaniciSifresi.equals("emir123")) {

                //sifreHakki = 0; //eğer kullanıcı doğru şifreyi girerse şifre hakkı otomatik 0'lanır.

                do {
                    System.out.println(" 1- Para çek\n 2- Para yatır \n 3- Bakiye sorgula \n 4- Çıkış yap");
                    System.out.print("Hoşgeldiniz. Lütfen işlem türünü seçiniz: ");
                    secim = input.nextInt();
                    if(secim==1){
                        System.out.println("Çekilecek miktarı girin: ");
                        int cekilenPara = input.nextInt();

                        if(cekilenPara<bakiye) {
                            bakiye -= cekilenPara;
                            System.out.println("İşlem başarılı. " + cekilenPara + " TL çekildi. Güncel bakiyen: " + bakiye + " TL");
                        }else{
                            System.out.println("Bakiyeniz yetersiz");
                            break;
                        }
                    }
                    else if(secim==2){
                        System.out.println("Yatıralacak miktarı girin: ");
                        int yatirilanPara = input.nextInt();
                        bakiye += yatirilanPara;
                        System.out.println("İşlem başarılı. " + yatirilanPara + " TL yatırıldı. Güncel bakiyen: " +  bakiye+ " TL");
                    }else if(secim==3){
                        System.out.println("Bakiyeniz: " + bakiye + " TL");
                    }
                } while (secim != 4);
                System.out.println("Çıkış yapıldı.");
                break;

            } else {
                System.out.println("Yanlış şifre! Kalan hakkınız: " + sifreHakki);
                if(sifreHakki == 0){
                    System.out.println("Çok fazla yanlış şifre girdiniz. Sistem bloke oldu.");
                }
            }
        }
    }
}
