package Week1;

import java.util.Scanner;

/*
    ## Ödev
    Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse yeni
    girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana
    "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
*/
public class userLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your username: "); // kullanıcı adını aldık
        String userName = input.next();
        System.out.print("enter your password: "); // şifre aldık
        String password = input.next();
        if (userName.equals("emir") && password.equals("emir123")) {
            System.out.println("User login successful!");
        } else {
            System.out.println("User login unsuccessful!");
            System.out.println("Would you like to reset your password?\n1-Yes\n2-No");
            int select = input.nextInt();
            switch (select) {
                case 1:
                    System.out.println("Enter the new password: ");
                    String newPassword = input.next();
                    if (newPassword.equals(password)) {
                        System.out.println("Password creation failed, please enter another password.");
                    } else {
                        System.out.println("Password created!");
                        password = newPassword;
                        System.out.println("Your new password: " + newPassword);
                    }
                    break;
                case 2:
                    System.out.println("Password reset process not performed. Program terminated.");
                    break;
                default:
                    System.out.println("Incorrect operation!!");
                    return;
            }
        }
    }
}
