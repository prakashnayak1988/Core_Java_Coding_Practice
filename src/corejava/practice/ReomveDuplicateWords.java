package corejava.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReomveDuplicateWords {

    public  static void main(String args[]){

        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");

       var uniquewords= listOfStrings.stream().collect(Collectors.toSet());
        System.out.println("Unique elements are "+uniquewords);


    }
}
