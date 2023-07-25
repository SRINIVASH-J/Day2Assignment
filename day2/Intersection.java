package week1.day2;

public class Intersection {
	public static void main(String[] args) {
		
		int[] a = { 6, 2, 7, 0};
		int[] b = { 7, 0, 2, 4};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}

}
