package Week5;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }
}






class Priorities {
    public List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> studentQueue = new PriorityQueue<>(
                new Comparator<Student>() {
                    public int compare(Student s1, Student s2) {
                        if (s1.getCGPA() != s2.getCGPA()) {
                            return Double.compare(s2.getCGPA(), s1.getCGPA());
                        } else if (!s1.getName().equals(s2.getName())) {
                            return s1.getName().compareTo(s2.getName());
                        } else {
                            return Integer.compare(s1.getID(), s2.getID());
                        }
                    }
                }
        );

        for (String event : events) {
            String[] parts = event.split(" ");
            if (parts[0].equals("ENTER")) {
                String name = parts[1];
                double cgpa = Double.parseDouble(parts[2]);
                int id = Integer.parseInt(parts[3]);
                studentQueue.add(new Student(id, name, cgpa));
            } else if (parts[0].equals("SERVED")) {
                studentQueue.poll();
            }
        }

        List<Student> remainingStudents = new ArrayList<>();
        while (!studentQueue.isEmpty()) {
            remainingStudents.add(studentQueue.poll());
        }

        return remainingStudents;
    }
}








public class Deneme {
    private final static Scanner input = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {

        //totalEvents: toplam Olaylar
        //ENTER  ==> GİRİŞ
        //SERVED ==> HİZMET VERİLDİ
        int totalEvents = Integer.parseInt(input.nextLine());

        List<String> events = new ArrayList<>();

        while (totalEvents != 0) {
            String event = input.nextLine();
            events.add(event);
            totalEvents--;
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}