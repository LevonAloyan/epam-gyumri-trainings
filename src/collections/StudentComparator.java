package collections;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{

    @Override
    public int compare(Student student1, Student student2) {
        int ageDiff = student1.getAge() - student2.getAge();
        if (ageDiff == 0){
            return student1.getName().compareTo(student2.getName());
        }else {
            return ageDiff;
        }
    }
}
