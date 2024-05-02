
package Week2.SalaryCalculator;

import java.util.Scanner;

/*
    Java'da "Employee" adında fabrika çalışanlarını temsil eden ve metotları ile çalışanların maaşlarını hesaplayan bir sınıf yazmalısınız.
    Bu sınıf 4 nitelik ve 5 metoda sahip olacaktır.

    Sınıfın Nitelikleri
    name : Çalışanın adı ve soyadı
    salary : Çalışanın maaşı
    workHours : Haftalık çalışma saati
    hireYear : İşe başlangıç yılı
 */
public class Employee { //çalışan
    String name;    // adı
    double salary;   // maaşı
    int workHours;  // haftalık çalışma saati
    int hireYear;    //işe başladığı yıl

    Employee(String name, double salary, int workHours, int hireYear) {         //kurucu metod, constructur
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {         //Maaşa uygulanan vergiyi hesaplar.
        double tax = 0.0;
        if (this.salary > 1000) {
            tax = this.salary * 0.03; // %3'lük vergi
        }
        return tax;
    }

    public double bonus() {
        double bonus = 0.0;
        if (this.workHours > 40) {
            int extraHours = this.workHours - 40; // Fazla çalışılan saatleri hesapla
            bonus = extraHours * 30; // Fazla çalışma saatlerine göre bonus hesapla
        }
        return bonus;
    }

    public double raiseSalary() {
        int currentYear = 2021;
        int yearsWorked = currentYear - this.hireYear;

        if (yearsWorked < 10) {
            // Maaşına %5 zam
            double increase = this.salary * 0.05;
            this.salary += increase;
            return increase;
        } else if (yearsWorked >= 10 && yearsWorked < 20) {
            // Maaşına %10 zam
            double increase = this.salary * 0.10;
            this.salary += increase;
            return increase;
        } else {
            // Maaşına %15 zam
            double increase = this.salary * 0.15;
            this.salary += increase;
            return increase;
        }
    }


    public String toString() {
        double tax = tax(); // Vergiyi hesapla
        double bonus = bonus(); // Bonusu hesapla
        double increase = raiseSalary(); // Maaş artışını hesapla
        double totalSalary = this.salary + bonus - tax; // Vergi ve bonuslar hesaplandıktan sonra toplam maaş
        return "=========================\n"
                +"Adı: " + this.name
                + "\nMaaşı: " + (this.salary-increase)
                + "\nÇalışma saati: " + this.workHours
                + "\nBaşlangıç yılı: " + this.hireYear
                + "\nVergi: " + tax
                + "\nBonus: " + bonus
                + "\nMaaş artışı: " + (increase)
                + "\nVergi ve Bonuslar ile birlikte maaş: " + (totalSalary-increase)
                + "\nToplam Maaş: " + (totalSalary);
    }

}
