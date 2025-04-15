package data_structure.array;

import java.util.Arrays;

public class TwoSum {

    public static void main(String args[]){

     // System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3,2,4}, 6)));

    }

    private static int[] twoSum(int[] nums, int target) {
            for(int i=0;i<nums.length;i++){
                int checkNum=target-nums[i];
                for(int j=nums.length-1;j>=0&&i!=j;j--){
                    if(checkNum==(nums[j])){
                        return  new int[] { i, j};
                    }
                }

            }

            System.out.println("No combination found");
            throw new IllegalArgumentException("No two sum solution");
        }
}
