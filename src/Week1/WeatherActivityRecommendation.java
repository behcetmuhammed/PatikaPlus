package Week1;
import java.util.Scanner;
/*
    Koşullar :
    Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
    Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
    Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
    Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

    ## Ödev
    Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.
* */
public class WeatherActivityRecommendation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        float temp = input.nextFloat();
/*
        if(temp<5){
            System.out.println("Today, you can go skiing as an activity."); //kayak
        }
        else if(temp >= 5 && temp < 15){
            System.out.println("Today, you can go to the cinema as an activity."); // sinema
        }
        else if(temp >= 15 && temp < 25){
            System.out.println("Today, you can go for a picnic as an activity."); // piknik
        }
        else {
            System.out.println("Today, you can go swimming as an activity."); // yüzme
        }*/

        //2. yöntem olarak, if ve else dışında switch-case yapısıyla, döngüler (loops) ve üçlü operatörlerle (ternary operator) de yapılabilir.

        //ternary operator yöntemi:
        //String activity = (temp < 5) ? "skiing" : (temp < 15) ? "cinema" : (temp < 25) ? "picnic" : "swimming";
        //Daha açık hali:
        String activity = (temp < 5) ? "skiing" :
                (temp < 15) ? "cinema" :
                        (temp < 25) ? "picnic" :
                                "swimming";

        System.out.println("Today, you can go " + activity + " as an activity.");
        //case yöntemi: (ancak burada eğer hava sıcaklığı -1 ve daha küçük bir değer ise bu kod sistemi hatalı çalışır!!)
        /*
        switch ((int) temp) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Today, you can go skiing as an activity."); // kayak
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                System.out.println("Today, you can go to the cinema as an activity."); // sinema
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                System.out.println("Today, you can go for a picnic as an activity."); // piknik
                break;
            default:
                System.out.println("Today, you can go swimming as an activity."); // yüzme
        }*/
    }
}
