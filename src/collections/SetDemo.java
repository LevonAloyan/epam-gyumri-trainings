package collections;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Levon"); // "Levon".hashcode() % 16 OR "Levon".hashcode() & 16-1
        set.add("Davit");
        set.add("Davit");
        set.add("Alina");
        set.add("Arman1");
        set.add("Harut");



        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("_________________");

        set = new LinkedHashSet<>();
        set.add("Levon");
        set.add("Davit");
        set.add("Davit");
        set.add("Alina");
        set.add("Arman1");
        set.add("Harut");

        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("_________________");

        set = new TreeSet<>();
        set.add("Levon"); // "Levon".hashcode() % 16 OR "Levon".hashcode() & 16-1
        set.add("Davit");
        set.add("Davit");
        set.add("Alina");
        set.add("Arman1");
        set.add("Harut");


        for (String s : set) {
            System.out.println(s);
        }

        Comparator<Student> studentComparator = new StudentComparator();
        Set<Student> students = new TreeSet<>(studentComparator);
        students.add(new Student(2L,"Alina",27));
        students.add(new Student(1L,"Garik",27));

        for (Student student : students) {
            System.out.println(student);
        }


    }
}
