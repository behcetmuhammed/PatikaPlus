package Week2.StudentInformationSystem;

/*
    ---- Student Sınıfı Özellikleri :
    Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
    Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()
*/
public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(double mathExem, double oralGradeMath, double phyExem, double oralGradePhy, double chemExem, double oralGradeChem) {

        if (mathExem >= 0 && mathExem <= 100 && oralGradeMath >= 0 && oralGradeMath <= 100) {
            this.mat.note = ((mathExem * 0.80)+(oralGradeMath*0.20));
        }

        if (phyExem >= 0 && phyExem <= 100) {
            this.fizik.note = ((phyExem * 0.80)+(oralGradePhy*0.20));
        }

        if (chemExem >= 0 && chemExem <= 100) {
            this.kimya.note = ((chemExem * 0.80)+(oralGradeChem*0.20));
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.printf("Ortalama : %.2f \n" , this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (this.fizik.note + this.kimya.note + this.mat.note) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
    }

}
