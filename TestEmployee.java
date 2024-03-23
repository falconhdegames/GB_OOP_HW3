package HW_3;

import java.util.ArrayList;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp0 = new Employee("James", 25, 30000);
        Employee emp1 = new Employee("Jason", 30, 50000);
        Employee emp2 = new Employee("Ivan", 40, 70000);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(emp0);
        employees.add(emp1);
        employees.add(emp2);
        
        for (Employee employee : employees) System.out.println(employee.toString());

        employees.sort(new EmployeeSalaryComparator());

        for (Employee employee : employees) System.out.println(employee.toString());
    }
}
