package HW_3;

public class Employee {
    public String name;
    public int age;
    public int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String toString() {
        return String.format("{name=%s, age: %s, salary: %s}", this.name, this.age, this.salary);
    }
}
