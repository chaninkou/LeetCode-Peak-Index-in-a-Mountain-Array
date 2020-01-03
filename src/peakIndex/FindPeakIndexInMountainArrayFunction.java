package peakIndex;

public class FindPeakIndexInMountainArrayFunction {
    public int peakIndexInMountainArray(int[] A) {
    	
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
