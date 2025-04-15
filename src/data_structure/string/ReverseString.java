package data_structure.string;

import java.util.Arrays;
import java.util.Optional;

public class ReverseString {

   public static void main(String [] args){

       String originalString="Prakash Chandra Nayak";
       //String originalString=null;
       System.out.println("original String -->"+ originalString);
       String reversedString= reverseString(originalString.toCharArray());
       System.out.println("Reversed String -->"+ reversedString);
       System.out.println("Reversed Number -->"+ reverseNumber(1234567891));
   }

   public static String reverseString(char [] word){
       int first=0, last=word.length-1;
       while( first<last){
        char tmp=word[first];
        word[first]=word[last];
        word[last]=tmp;
        first++;
        last--;
       }
       System.out.println(word);
       return Arrays.toString(word);
   }
   public static int reverseNumber(int number){
       int reverse=0;
       while(number!=0){
           reverse=reverse*10+number%10;
           number/=10;
       }
       return reverse;
   }
}
