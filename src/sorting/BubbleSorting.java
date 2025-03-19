package sorting;

public class BubbleSorting {
    public static void main(String args[]){
        System.out.println("Bubble Sort Started-----");
        int arr[]={6,3,6,9,2,4,1,3,7};
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println("Bubble Sort finished and Array is-->");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
