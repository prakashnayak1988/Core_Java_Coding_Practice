package corejava.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenAndOddNumber {
    public static void main(String args[]){

        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        var even=listOfIntegers.stream().filter(n->n%2==0).toList();
        for (int i : even)
        {
            System.out.println("Even number --->"+i);
        }
        var odd=listOfIntegers.stream().filter(n->n%2!=0).toList();
        for (int i : odd)
        {
            System.out.println("Odd number --->"+i);
        }
    }
}
