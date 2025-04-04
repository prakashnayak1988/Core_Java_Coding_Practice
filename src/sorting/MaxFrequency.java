package sorting;

public class MaxFrequency {
    public static int frequencyOfMaxValue(int[] arr) {
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int num : arr) {
            if (num > max) {
                max = num;
                count = 1;
            } else if (num == max) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 4, 4,4,5,5,6,6,6,6};
        System.out.println("Frequency of maximum value: " + frequencyOfMaxValue(array));
    }
}
