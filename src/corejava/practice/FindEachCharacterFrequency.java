package corejava.practice;

import java.util.function.Function;
import java.util.stream.Collectors;

public class FindEachCharacterFrequency {
    public static void main(String args[]){
        String inputString = "Java Concept Of The Day";
        var map=inputString.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
   System.out.println(map);
    }
}
