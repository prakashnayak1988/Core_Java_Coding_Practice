package core.java.training.datastructure.navigableset;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
       // return o1.getSalary().compareTo(o2.getSalary());
      return  Integer.compare(o1.getSalary(),o2.getSalary());
    }

}
