package sorting;

import java.util.Arrays;

public class ReverseAString {

    public static void main(String []args){
       String str="Prakash";
        System.out.println("Orginal String is ------- Reversed String is %s"+str+" ------"+reverse(str));

        System.out.println("Reverese a number "+reverseNumber(1234567890));
    }

    public static String reverse(String str){
         char []arr=str.toCharArray();

         int left=0, right=str.length()-1;
         while(left<right){
             char tmp=arr[left];
             arr[left]=arr[right];
             arr[right]=tmp;
             left++;
             right--;
         }
         //return String.valueOf(arr);
         return new String(arr);
    }

    public static int reverseNumber(int num){
        int revnum=0;
        while(num>0){
            int mod=num%10;
            revnum=revnum*10+mod;
            num/=10;
        }
        return revnum;



    }

}
