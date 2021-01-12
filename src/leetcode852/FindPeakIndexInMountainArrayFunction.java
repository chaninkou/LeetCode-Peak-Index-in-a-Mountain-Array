package leetcode852;

public class FindPeakIndexInMountainArrayFunction {
	// O(logn) solution
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        
        while (left < right) {
            int mid = left + ((right - left) / 2);
            if (arr[mid] < arr[mid + 1]){
                left = mid + 1;
            }
            else{
                right = mid;
            }
        }
        return left;
    }
    
    public int peakIndexInMountainArray2(int[] A) {
    	
    	if(A == null || A.length == 0){
    		return 0;
    	}
    	
    	// Starts from 1, i + 1 because we always check 2 elements
        for(int i = 1; i + 1 < A.length; i++){
        	// Since the answer should be bigger or less than the current answer
            if(A[i] > A[i + 1]){
                return i;
            }
        }
        
        return 0;
    }
}
