package corejava.practice;

import java.util.stream.IntStream;

import static java.lang.Math.sqrt;

public class FindPrimeNumber {

    public static void main(String args[]){
       System.out.println(checkPrimeNumber(2));
        System.out.println(checkPrimeNumber(12));
        System.out.println(checkPrimeNumber(52));
        System.out.println(checkPrimeNumber(21));
        System.out.println(checkPrimeNumber(3));
        System.out.println(checkPrimeNumber(5));



    }

    private static boolean checkPrimeNumber(int num){



        boolean isPrime= IntStream.rangeClosed(2, (int)sqrt(num))
                .noneMatch(x->num%x==0);
        return isPrime;
    }



}
