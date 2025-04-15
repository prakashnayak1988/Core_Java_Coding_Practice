package data_structure.array;

import java.util.Arrays;

import static data_structure.array.PlusOne.plusOne;

public class PlusOne {
    public static void main(String[] args) {
 int []input=new int[]{9,9,9,9};
        PlusOne.plusOne(input);
        System.out.println(Arrays.toString(secondApproach(input)));

    }
    public static void plusOne(int [] nums){
       int number=0;
       for(int num:nums ){
           number=number*10+num;
       }
       number++;
System.out.println("Number is "+number);
       int [] finalnum=new int[Integer.toString(number).length()];
       System.out.println("Number is "+number);
      for(int i=finalnum.length-1;i>=0;i--){
          int digit=number%10;
           number=number/10;
           System.out.println("Digit is --- "+i+  " "+digit);
          finalnum[i]=digit;
      }

       System.out.println("Number is "+ Arrays.toString(finalnum));
    }


    public static int[] secondApproach(int[] digits) {
        int n = digits.length;

        // Traverse from last digit to the first
        for (int i = n - 1; i >= 0; i--) {
            // If digit is less than 9, increment and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If digit is 9, set it to 0 (carry over to the next digit)
            digits[i] = 0;
        }

        // If all digits were 9, e.g. 999 → need new array [1, 0, 0, 0]
        int[] result = new int[n + 1];
        result[0] = 1; // rest are 0 by default
        return result;
    }
}
