package core.java.training.datastructure.navigableset;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class EmpInterface {

    public static void main(String [] args){
        NavigableSet<Employee>empSet=new TreeSet<>(new EmployeeComparator());
        empSet.add(new Employee("Prakash",1000));
        empSet.add(new Employee("Amit",550));
        empSet.add(new Employee("Sonu",5000));
        empSet.add(new Employee("Mukesh",1050));
        empSet.add(new Employee("Gaurav",3000));
        empSet.add(new Employee("Prakash",4000));
        empSet.add(new Employee("Prakash",499));

        System.out.println("Salary ascending order "+empSet);
       Employee e1= empSet.higher(new Employee("Prakash",1000));
       System.out.println("Salary greater than Prakash >"+e1);

        Employee e2= empSet.lower(new Employee("Prakash",1000));
        System.out.println("Salary lower than Prakash  > "+e2);
        Employee empList= empSet.lower(new Employee("Prakash",499));
        System.out.println("Employee-->"+empList);
        Set<Employee> empSet1=empSet.descendingSet();
        System.out.println("Reverse order "+empSet1);

    }
}
