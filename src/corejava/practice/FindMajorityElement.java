package corejava.practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindMajorityElement {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int n = nums.length;
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            // If an element's count exceeds n/2, return it
            if (countMap.get(num) > n / 2) {
                return num;
            }
        }
        return -1; // Shouldn't reach here if input is valid
    }

    public static int majorityElementMoore(int[] nums) {
        int candidate = nums[0];
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }

    public static void main(String args[]){
      int numArray[]={4,3,5,6,7,3,4,3,3};
       // int numArray[]={2,3,2};
       int majorityNumber = FindMajorityElement.majorityElement(numArray);
       int majorityNumber1 = FindMajorityElement.majorityElementMoore(numArray);
       System.out.println("Majority number is -->"+majorityNumber);
        System.out.println("Majority number by Moore -->"+majorityNumber1);
    }
}
