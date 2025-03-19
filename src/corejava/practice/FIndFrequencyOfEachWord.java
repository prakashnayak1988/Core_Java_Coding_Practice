package corejava.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FIndFrequencyOfEachWord {
    public static void main(String[] args){

       var stationeryList = List.of("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
       var map=stationeryList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("Words with frequency -->"+map);

       var sortedAscOrder= stationeryList.stream().sorted().toList();
       System.out.println("Sorted order -->"+sortedAscOrder);

        var reverseOrder= stationeryList.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("Orted by Reverse order -->"+reverseOrder);


    }
}
