package data_structure.array;

import java.util.Arrays;

public class MovesZeroes {

    public static void main(String[] args) {

        int []input=new int[]{0,9,9,9,93,4,0,8,1,4,0,0};
        int []input1=new int[]{1,0,2,0,3,0,4,0,5,0};
        System.out.println(Arrays.toString(moveZeroesAtLast(input)));
        System.out.println(Arrays.toString(moveZeroesToFirst(input1)));

    }
    private  static int[]  moveZeroesAtLast(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                nums[j++]=nums[i];
            }
        }
        for(int i=j;i<nums.length;i++){
            nums[i]=0;
        }

   return nums;
    }

    private  static int[]  moveZeroesToFirst(int[] nums) {
       System.out.println("Given Array "+Arrays.toString(nums));
        int j= nums.length-1;
        for(int i=nums.length-1;i>=0;i--) {
            if (nums[i] != 0) {
                nums[j--] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        for(int i=0;i<=j;i++){
            nums[i]=0;
        }
        return nums;
    }
}
