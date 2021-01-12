package leetcode852;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] A = {0,1,2,1,0};
		
		System.out.println("Input: " + Arrays.toString(A));
		
		FindPeakIndexInMountainArrayFunction solution = new FindPeakIndexInMountainArrayFunction();
		
		System.out.println("Solution: " + solution.peakIndexInMountainArray(A));
		
	}
}
