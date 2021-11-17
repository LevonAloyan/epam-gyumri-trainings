package immutableClassesExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class  Student {
    private final String name;
    private final String surname;
    private final int age;
    private final List<String> lessons;

    public Student(String name, String surname, int age, List<String> lessons) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.lessons = lessons;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public List<String> getLessons() {
//        return Collections.unmodifiableList(lessons);
        return new ArrayList<>(lessons);
    }
}
