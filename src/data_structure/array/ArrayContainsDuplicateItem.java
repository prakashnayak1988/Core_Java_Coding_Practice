package data_structure.array;

import java.util.HashSet;

public class ArrayContainsDuplicateItem {
    public static void main(String[] args) {
       System.out.println(containsDuplicate(new int[]{1,2,4,5,3,6,64,5}));

    }
    public static boolean containsDuplicate(int[] nums) {
        HashSet seen=new HashSet();
        for(int i=0;i<nums.length;i++){
            if(seen.contains(nums[i])){
                return true;
            }
            seen.add(nums[i]);
            System.out.println("Distinct(Element are ---->"+seen);
        }
        return false;
    }
}
