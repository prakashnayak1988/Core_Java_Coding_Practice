package data_structure.array;

import java.util.Arrays;

public class ReverseAnArraybyN {
    public static void main(String[] args) {
        reverseAnArrayBruteForce(new int[]{1,2,3,4,5},3);
        System.out.println("==========Without using Extra Array ===========");
        reverseArray(new int[]{1,2,3,4,5});
    }

    private static void reverseAnArrayBruteForce(int[] arr, int n) {
        n=n%arr.length;
        int []tmp=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            tmp[(n+i)%arr.length]=arr[i];
            System.out.println("  "+i +Arrays.toString(Arrays.stream(tmp).toArray()));
        }
        System.out.println(Arrays.toString(Arrays.stream(tmp).toArray()));

    }
   private static void reverseArray(int[] arr1){
        int left=0, right=arr1.length-1;
        while(left<right){
            int temp=arr1[left];
            arr1[left]=arr1[right];
            arr1[right]=temp;
            left++;
            right--;
            System.out.println(Arrays.toString(Arrays.stream(arr1).toArray()));
        }

       System.out.println(Arrays.toString(Arrays.stream(arr1).toArray()));

    }
}
