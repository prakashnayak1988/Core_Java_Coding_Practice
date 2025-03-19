package corejava.practice.employee;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeTest {
    public static void main(String args[]){

        List<Employee> employees = List.of(
                new Employee("Alice", 30, "HR", 50000),
                new Employee("Bob", 25, "IT", 60000),
                new Employee("Charlie", 35, "FINANCE", 70000),
                new Employee("David", 28, "HR", 55000),
                new Employee("Eve", 32, "HR", 65000),
                new Employee("Frank", 40, "FINANCE", 75000)
        );
       // Printing all the employees
        System.out.println("Employees Object without any sorting:");
       employees.forEach(System.out::println);
       //printing name grouping by department Name
       var collects = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println("Employees grouped by department:");
        collects.forEach((department, empList) -> {
            System.out.println(department + ": " + empList);
        });

        System.out.println("By Department average salary");
       var avgSalaryByDepartment=employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("\nAverage salary by department:");
        avgSalaryByDepartment.forEach((department, avgSalary) -> {
            System.out.println(department + ": " + avgSalary);
        });

        System.out.println("\nHighest-paid employee by department:");

        Map<String, Optional<Employee>> highestPaidByDepartment= employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparing(Employee::getSalary))));

        highestPaidByDepartment.forEach((department, employee) -> {
            employee.ifPresent(emp -> System.out.println(department + ": " + emp.getSalary()));
        });

        System.out.println("\nTotal Salary is -->");
       Double totalSalary= employees.stream().mapToDouble(Employee::getSalary).sum();
       System.out.println("Total Salary is -->"+totalSalary);


       System.out.println("\nHighest Salary :");
       var maxSalary=employees.stream().max(Comparator.comparing(Employee::getSalary));
       System.out.println(maxSalary);

        System.out.println("\nSecond Highest Salary :");
       var secondSalary= employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst();

       System.out.println("Second highest salary"+secondSalary);


    }


}
