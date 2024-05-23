package Week5.TreeSet;

import java.util.Collections;
import java.util.Comparator;

public class OrderNoteComperetor implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2){
        return s1.note - s2.note;
    }

}
