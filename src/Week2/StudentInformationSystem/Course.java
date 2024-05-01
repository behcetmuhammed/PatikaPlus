package Week2.StudentInformationSystem;

/*
    ---- Course Sınıfı Özellikleri :
    Nitelikler : name,code,prefix,note,Teacher
    Metotlar : Course() , addTeacher() , printTeacher()

*/
public class Course {
    Teacher courseTeacher; //Teacher(String name, long telNo, String branch)
    String name;
    String code;
    String prefix;
    double note;
    double oralGrade;

    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this. prefix = prefix;
        this.note = 0.0;
        this.oralGrade = 0.0;
    }                                           //Teacher t1 = new Teacher("Emir Hoca" , 05111, "MTH");
    public void addTeacher(Teacher t) {         //Teacher(String name, long telNo, String branch)
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}
