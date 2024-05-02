package Week2.SalaryCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen güncel yılı giriniz: ");
        int currentYear = input.nextInt();
        */

        Employee emp1 = new Employee("Emir Emiroğlu", 2500, 43, 1995);
        Employee emp2 = new Employee("Behcet Muhammed" , 1900, 39, 2005);
        Employee emp3 = new Employee("Fener Bahçe" , 1300, 25, 2018);
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());
    }
}
