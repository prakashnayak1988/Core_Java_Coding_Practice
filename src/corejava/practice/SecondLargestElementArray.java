package corejava.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class SecondLargestElementArray {
    public static void main(String args[]){
        Integer arr[]={12, 35, 1, 10, 34, 1};
       // Integer arr[]={12, 12, 12};
      /*Using Lambda function */
        List list=Arrays.asList(arr);
        Optional l1=list.stream().sorted(Collections.reverseOrder()).skip(1).findFirst();
        System.out.println("Result is -->"+l1.get());

        /*Using traditional method */
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[0]){
                System.out.printf("The second largest element is %d\n", arr[i]);
                return;
            }
        }
        System.out.println("There is no second highest element avaialble");



    }


}
