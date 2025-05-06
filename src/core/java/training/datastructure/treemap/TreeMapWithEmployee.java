package core.java.training.datastructure.treemap;

import java.util.*;

public class TreeMapWithEmployee {
    public static void main(String[] args) {
        TreeMap<Employee, String> employeeMap = new TreeMap<>();

        employeeMap.put(new Employee(102, "Alice", 70000), "HR");
        employeeMap.put(new Employee(101, "Bob", 60000), "Finance");
        employeeMap.put(new Employee(103, "Charlie", 80000), "Engineering");

        System.out.println("Employees sorted by ID:");
        for (Map.Entry<Employee, String> entry : employeeMap.entrySet()) {
            System.out.println(entry.getKey() + " => Department: " + entry.getValue());
        }
    }
}

