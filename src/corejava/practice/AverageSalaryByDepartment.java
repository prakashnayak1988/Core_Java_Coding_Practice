package corejava.practice;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + " (" + department + ", $" + salary + ")";
    }
}

public class AverageSalaryByDepartment {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", "HR", 50000),
                new Employee(2, "Bob", "IT", 70000),
                new Employee(3, "Charlie", "HR", 55000),
                new Employee(4, "David", "IT", 80000),
                new Employee(5, "Eve", "Finance", 90000)
        );

        // Calculate Average Salary by Department
        Map<String, Double> avgSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ));

        // Print results
        avgSalaryByDept.forEach((dept, avgSalary) ->
                System.out.println(dept + ": $" + avgSalary)
        );
    }
}
