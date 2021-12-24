package stream_api;

public class Employee {

    private String salary;

    public Employee(String salary){
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary='" + salary + '\'' +
                '}';
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
