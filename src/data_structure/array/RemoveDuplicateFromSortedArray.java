package data_structure.array;

public class RemoveDuplicateFromSortedArray {

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,4,5,5,7,7,9,9,10};
       /* int i = 0;
        for(int j=1; j<arr.length; j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        for(int k=0; k<=i; k++){
           System.out.print(arr[k]+" ");
        }*/

System.out.println("Hello");
        System.out.println("From New Method --> "+removeDuplicates(arr));
    }

  public static int removeDuplicates(int[] nums) {
    int indexOfNo = 1;

        for(int i=1;i<nums.length;i++){
        if(nums[i]!=nums[i-1]){
            nums[indexOfNo] = nums[i];
            indexOfNo++;
        }
    }
      System.out.println("Now printing the Array");
        for(int j=0;j<indexOfNo;j++){
            System.out.print(nums[j]+" ");
        }
        return indexOfNo;
}
}
