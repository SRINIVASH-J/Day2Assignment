package week1.day2;
import java.util.Arrays;
public class Arr {
	
	   public static void main(String[] args) {
	        int[] nums = {5, 8, 8, 5, 9, 2, 3};
	        findDuplicates(nums);
	    }

	    public static void findDuplicates(int[] nums) {
	        System.out.println("Duplicate numbers in the array:");

	        for (int i = 0; i < nums.length - 1; i++) {
	            for (int j = i + 1; j < nums.length; j++) {
	                if (nums[i] == nums[j]) {
	                    System.out.println(nums[i]);
	                }
	            }
	        }
	    }
	}
	



