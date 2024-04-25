package Week1;

import java.util.Scanner;

/*
    Koç Burcu : 21 Mart - 20 Nisan
    Boğa Burcu : 21 Nisan - 21 Mayıs
    İkizler Burcu : 22 Mayıs - 22 Haziran
    Yengeç Burcu : 23 Haziran - 22 Temmuz
    Aslan Burcu : 23 Temmuz - 22 Ağustos
    Başak Burcu : 23 Ağustos - 22 Eylül
    Terazi Burcu : 23 Eylül - 22 Ekim
    Akrep Burcu : 23 Ekim - 21 Kasım
    Yay Burcu : 22 Kasım - 21 Aralık
    Oğlak Burcu : 22 Aralık - 21 Ocak
    Kova Burcu : 22 Ocak - 19 Şubat
    Balık Burcu : 20 Şubat - 20 Mart

    ##Ödev
    Aynı örneği switch-case kullanmadan yapınız.
* */
public class horoscopeFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz ayı giriniz: ");
        int ay = input.nextInt();

        System.out.print("Doğduğunuz günü giriniz: ");
        int gun = input.nextInt();

        if (1 <= ay && ay <= 12) {
            if (ay == 1) {
                if (1 <= gun && gun <= 31) {
                    if (gun >= 22) {
                        System.out.println("Kova Burcusunuz!");
                    } else {
                        System.out.println("Oğlak Burcusunuz!");
                    }
                } else {
                    System.out.println("geçersiz gün girdiniz!");
                }
            } else if (ay == 2) {
                if (1 <= gun && gun <= 29) {
                    if (gun >= 20) {
                        System.out.println("Balık Burcusunuz!");
                    } else {
                        System.out.println("Kova Burcusunuz!");
                    }
                } else {
                    System.out.println("geçersiz gün girdiniz!");
                }
            } else if (ay == 3) {
                if (1 <= gun && gun <= 31) {
                    if (gun >= 21) {
                        System.out.println("Koç Burcusunuz!");
                    } else {
                        System.out.println("Balık Burcusunuz!");
                    }
                } else {
                    System.out.println("geçersiz gün girdiniz!");
                }
            } else if (ay == 4) {
                if (1 <= gun && gun <= 30) {
                    if (gun >= 21) {
                        System.out.println("Boğa Burcusunuz!");
                    } else {
                        System.out.println("Koç Burcusunuz!");
                    }
                } else {
                    System.out.println("geçersiz gün girdiniz!");
                }
            } else if (ay == 5) {
                if (1 <= gun && gun <= 31) {
                    if (gun >= 22) {
                        System.out.println("İkizler Burcusunuz!");
                    } else {
                        System.out.println("Boğa Burcusunuz!");
                    }
                } else {
                    System.out.println("geçersiz gün girdiniz!");
                }
            } else if (ay == 6) {
                if (1 <= gun && gun <= 30) {
                    if (gun >= 23) {
                        System.out.println("Yengeç Burcusunuz!");
                    } else {
                        System.out.println("İkizler Burcusunuz!");
                    }
                } else {
                    System.out.println("geçersiz gün girdiniz!");
                }
            } else if (ay == 7) {
                if (1 <= gun && gun <= 31) {
                    if (gun >= 23) {
                        System.out.println("Aslan Burcusunuz!");
                    } else {
                        System.out.println("Yengeç Burcusunuz!");
                    }
                } else {
                    System.out.println("geçersiz gün girdiniz!");
                }
            } else if (ay == 8) {
                if (1 <= gun && gun <= 31) {
                    if (gun >= 23) {
                        System.out.println("Başak Burcusunuz!");
                    } else {
                        System.out.println("Aslan Burcusunuz!");
                    }
                }
                else {
                    System.out.println("geçersiz gün girdiniz!");
                }
            } else if (ay == 9) {
                if (1 <= gun && gun <= 30) {
                    if (gun >= 23) {
                        System.out.println("Terazi Burcusunuz!");
                    } else {
                        System.out.println("Başak Burcusunuz!");
                    }
                }
                else {
                    System.out.println("geçersiz gün girdiniz!");
                }
            } else if (ay == 10) {
                if (1 <= gun && gun <= 31) {
                    if (gun >= 23) {
                        System.out.println("Akrep Burcusunuz!");
                    } else {
                        System.out.println("Terazi Burcusunuz!");
                    }
                }
                else {
                    System.out.println("geçersiz gün girdiniz!");
                }
            } else if (ay == 11) {
                if (1 <= gun && gun <= 30) {
                    if (gun >= 22) {
                        System.out.println("Yay Burcusunuz!");
                    } else {
                        System.out.println("Akrep Burcusunuz!");
                    }
                }
                else {
                    System.out.println("geçersiz gün girdiniz!");
                }
            } else if (ay == 12) {
                if (1 <= gun && gun <= 31) {
                    if (gun >= 22) {
                        System.out.println("Oğlak Burcusunuz!");
                    } else {
                        System.out.println("Yay Burcusunuz!");
                    }
                } else {
                    System.out.println("geçersiz gün girdiniz!");
                }
            }

        } else {
            System.out.println("Böyle bir ay yok!");
        }

        /*
        switch (ay){
            case 1:
                if(1 <= gun && gun <= 31){
                    if(gun >= 22){
                        System.out.println("Kova burcusunuz!");
                    }else{
                        System.out.println("Oğlak burcusunuz!");
                    }
                }
                else{
                    System.out.println("Geçersiz bir gün girdiniz!");
                }
                break;
            case 2:
                if(1 <= gun && gun <= 29){
                    if(gun >= 20){
                        System.out.println("Balık burcusunuz!");
                    }else{
                        System.out.println("Kova burcusunuz!");
                    }
                }
                else{
                    System.out.println("Geçersiz bir gün girdiniz!");
                }
                break;
            case 3:
                if(1 <= gun && gun <= 31){
                    if(gun >= 21){
                        System.out.println("Koç burcusunuz!");
                    }else{
                        System.out.println("Balık burcusunuz!");
                    }
                }
                else{
                    System.out.println("Geçersiz bir gün girdiniz!");
                }
                break;
            case 4:
                if(1 <= gun && gun <= 30){
                    if(gun >= 21){
                        System.out.println("Boğa burcusunuz!");
                    }else{
                        System.out.println("Koç burcusunuz!");
                    }
                }
                else{
                    System.out.println("Geçersiz bir gün girdiniz!");
                }
                break;
            case 5:
                if(1 <= gun && gun <= 31){
                    if(gun >= 22){
                        System.out.println("İkizler burcusunuz!");
                    }else{
                        System.out.println("Boğa burcusunuz!");
                    }
                }
                else{
                    System.out.println("Geçersiz bir gün girdiniz!");
                }
                break;
            case 6:
                if(1 <= gun && gun <= 30){
                    if(gun >= 23){
                        System.out.println("Yengeç burcusunuz!");
                    }else{
                        System.out.println("İkizler burcusunuz!");
                    }
                }
                else{
                    System.out.println("Geçersiz bir gün girdiniz!");
                }
                break;
            case 7:
                if(1 <= gun && gun <= 31){
                    if(gun >= 23){
                        System.out.println("Aslan burcusunuz!");
                    }else{
                        System.out.println("Yengeç burcusunuz!");
                    }
                }
                else{
                    System.out.println("Geçersiz bir gün girdiniz!");
                }
                break;
            case 8:
                if(1 <= gun && gun <= 31){
                    if(gun >= 23){
                        System.out.println("Başak burcusunuz!");
                    }else{
                        System.out.println("Aslan burcusunuz!");
                    }
                }
                else{
                    System.out.println("Geçersiz bir gün girdiniz!");
                }
                break;
            case 9:
                if(1 <= gun && gun <= 30){
                    if(gun >= 23){
                        System.out.println("Terazi burcusunuz!");
                    }else{
                        System.out.println("Başak burcusunuz!");
                    }
                }
                else{
                    System.out.println("Geçersiz bir gün girdiniz!");
                }
                break;
            case 10:
                if(1 <= gun && gun <= 31){
                    if(gun >= 23){
                        System.out.println("Akrep burcusunuz!");
                    }else{
                        System.out.println("Terazi burcusunuz!");
                    }
                }
                else{
                    System.out.println("Geçersiz bir gün girdiniz!");
                }
                break;
            case 11:
                if(1 <= gun && gun <= 30){
                    if(gun >= 22){
                        System.out.println("Yay burcusunuz!");
                    }else{
                        System.out.println("Akrep burcusunuz!");
                    }
                }
                else{
                    System.out.println("Geçersiz bir gün girdiniz!");
                }
                break;
            case 12:
                if(1 <= gun && gun <= 31){
                    if(gun >= 22){
                        System.out.println("Oğlak burcusunuz!");
                    }else{
                        System.out.println("Yay burcusunuz!");
                    }
                }
                else{
                    System.out.println("Geçersiz bir gün girdiniz!");
                }
                break;
            default:
                System.out.println("Yanlış tercih yaptınız");
        }*/
    }
}
