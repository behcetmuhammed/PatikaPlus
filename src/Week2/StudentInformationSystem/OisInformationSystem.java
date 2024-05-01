package Week2.StudentInformationSystem;

import java.awt.*;

/*
    Ödev
    Course sınıfına derse ait sözlü notu kısmını girin ve ortalamaya etkisini her ders için ayrı ayrı belirtin. Sözlü notların ıda ortalamaya etkileme yüzdesi ile dahil edin.
    Örnek : Fizik dersine ait sözlü notunun ortalamaya etkisi %20 ise sınav notunun etkisi %80'dir.
    Öğrenci sözlüden 90, sınavdan 60 almış ise, o dersin genel ortalamaya etkisi şu şekilde hesaplanır :
    Fizik Ortalaması : (90 * 0.20) + (60* 0.80);
*/
public class OisInformationSystem {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Emir Hoca" , 05111, "MTH"); //matematik öğretmeni
        Teacher t2 = new Teacher("Behcet Hoca" , 05222, "PHY"); //fizik öğretmeni
        Teacher t3 = new Teacher("Ayda Hoca" , 05333, "CHEM"); //kimya öğretmeni

        Course c1 = new Course("Mathematics" , "101", "MTH");
        Course c2 = new Course("Physics" , "101", "PHY");
        Course c3 = new Course("Chemistry" , "101", "CHEM");

        Student s1 = new Student("Ahmet Karakaya", 4, "547", c1, c2, c3);

        s1.addBulkExamNote(0, 70, 60, 90, 47, 85);
        s1.isPass();
    }
}