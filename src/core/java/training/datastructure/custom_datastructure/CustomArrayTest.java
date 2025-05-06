package core.java.training.datastructure.custom_datastructure;

public class CustomArrayTest {
    public static void main(String[] args) {
        CustomArray arr = new CustomArray();
        arr.add(90);
        arr.add(70);
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.print(); // Output: 10 20 30
        arr.insert(0,50);


        System.out.println(arr.contains(11));
        System.out.println("Element at index 1: " + arr.get(1)); // Output: 20

        arr.remove(1);
        arr.print(); // Output: 10 30

        System.out.println("Index of 50 is "+arr.indexOf(50));


        System.out.println("Before Sorting");
        arr.print();
        System.out.println("After Sorting");
        arr.sort();

        System.out.println("Size: " + arr.size());         // Output: 2
        System.out.println("Capacity: " + arr.capacity()); // Output: 10 (or more after resize)
    }
}

