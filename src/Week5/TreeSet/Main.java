package Week5.TreeSet;

import com.sun.source.tree.Tree;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        TreeSet<Student> tSet = new TreeSet<>(new OrderNameComperetor().reversed());

        tSet.add(new Student("Emir", 89));
        tSet.add(new Student("Gonca", 89));
        tSet.add(new Student("Ahmet", 70));
        tSet.add(new Student("Filiz", 5));

        for (Student std : tSet) {
            System.out.println(std.getName());
        }

        System.out.println("----------");

        Iterator<Student> itr = tSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next().getName());
        }


    }
}