package corejava.practice;

public class DigitPowerSum {
    public static void main(String[] args) {
        int num = 153; // Change this number to test
        int numDigits = String.valueOf(num).length(); // Calculate number of digits

        int sum = String.valueOf(num).chars()
                .map(Character::getNumericValue)
                .map(digit -> (int) Math.pow(digit, numDigits))
                .sum();

        System.out.println("Sum of digits raised to the power of " + numDigits + ": " + sum);

        System.out.println(String.valueOf("prakash"));
    }
}
