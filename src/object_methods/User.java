package object_methods;

import java.util.Date;

public final class User implements Cloneable {

    private String name;
    private int age;
    private Date date;

    public User(String name, int age, Date date){
        this.name = name;
        this.age = age;
        this.date = (Date) date.clone();
    }

    @Override
    public User clone() throws CloneNotSupportedException {
        User clone = (User) super.clone();
        Date clonedDate = (Date) clone.getDate().clone();
        clone.date= clonedDate;

        return clone;
    }

    public Date getDate() {
        return (Date) date.clone();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
