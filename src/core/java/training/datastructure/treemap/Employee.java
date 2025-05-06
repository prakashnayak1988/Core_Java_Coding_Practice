package core.java.training.datastructure.treemap;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    // Implement compareTo for natural ordering (by ID)
    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "[" + id + ", " + name + ", " + salary + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee emp = (Employee) o;
        return id == emp.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

