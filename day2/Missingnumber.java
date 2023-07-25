package week1.day2;

public class Missingnumber {
	
	  public static void main(String[] args) {
	        int[] grp = {1, 2, 3, 4, 5, 6, 8};
	        int missingNumber = findMissingNumber(grp);
	        System.out.println("The missing number is: " + missingNumber);
	    }

	    public static int findMissingNumber(int[] nums) {
	        int n = nums.length + 1; 
	        int totalSum = (n * (n + 1)) / 2; 
	        int arraySum = 0;

	        for (int num : nums) {
	            arraySum += num; 
	        }

	        return totalSum - arraySum; 
	    }
	}
	







