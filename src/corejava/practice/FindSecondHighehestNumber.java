package corejava.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindSecondHighehestNumber {

    public static void main(String[] args) {
        int a[] = { 3, 6, 32, 1, 8, 5, 31, 22 };
        List num=Arrays.asList(5,7,2,6,5,4,10,10);

        int secundMax = Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).skip(1).findAny().get();
        System.out.println(secundMax);


    }
}
