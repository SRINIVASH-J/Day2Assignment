package week1.day2;
import java.util.Arrays;

public class Largest {
	
    public static void main(String[] args) {
        int[] nums = { 7, 8, 5, 9, 2, 3};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println("The second largest number is: " + secondLargest);
    }
}