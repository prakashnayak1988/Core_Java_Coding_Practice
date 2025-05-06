package core.java.training.datastructure.navigableset;

import java.util.Objects;

public class Employee {
    private Integer salary;
    private final String name;

    Employee(String name, Integer salary){
        this.name=name;
        this.salary=salary;
    }
    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salary, name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}
