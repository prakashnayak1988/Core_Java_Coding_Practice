package corejava.practice;

import java.util.Arrays;
import java.util.List;

public class CountingElementWithZeros {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Integer> list1= Arrays.asList(0,10,9,12,0,11,8,5,2,0,5,7,0,1);
        long count=list1.stream().filter(x->x.equals(0)).count();
        System.out.println("Count---->"+count);
        /* Moving all the items to left and zeroes to right */
        int newArray[]=new int[list1.size()];
        int k=0;
        for(Object o:list1){
            if((int)o>0){
                newArray[k]=(int)o;
                k++;
            }
        }
       for(int i:newArray){
           System.out.println(i);

       }
       /* Without using the extra array*/
        for(Integer o:list1){
            if(o>0){


            }

        }
    }
}