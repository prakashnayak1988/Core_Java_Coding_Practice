package data_structure.array;

import java.util.HashSet;
import java.util.Set;

// Here given a pair of number and you need to find the number which doesn't have pair
public class SingleNumber {
    public static void main(String[] args) {
       System.out.println(singleNumber(new int[]{1,2, 3, 5, 4, 5, 3, 4}));

    }

    public static int singleNumber(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
            }else{
                set.add(nums[i]);
            }
        }
        System.out.println("Printing the set -->"+set);
        return set.iterator().next();

    }
}
