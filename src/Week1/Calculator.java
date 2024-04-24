package Week1;

import java.util.Scanner;

//switch-case kullanarak hesap makinesi yapınız.
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the 1st number: "); //sayı 1'in değeri
        int num1 = input.nextInt();
        System.out.print("Enter the 2nd number: "); //sayı 2'in değeri
        int num2 = input.nextInt();
        System.out.println("Select the operation you want to perform: 1- Sum\n2-Subtraction\n3-Multiplication\n4-Division\n");//işlem seçimi
        int select = input.nextInt();
        int result = 0; //Sonucu default olarak 0 atadık
        switch (select) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if(num2 == 0){
                    System.out.println("You made an incorrect operation. The denominator cannot be zero."); // payda 0 olamaz
                    return;
                }
                else {
                    result = num1 / num2;
                }
                break;
            default:
                System.out.println("You entered a wrong transaction!!"); //yanlış işlem
                return;
        }
        System.out.println("Result: " + result);
    }
}