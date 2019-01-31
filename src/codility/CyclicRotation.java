package codility;
// you can also use imports, for example:
import java.util.*;

	// you can write to stdout for debugging purposes, e.g.
	// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        
        int arraySize = A.length;
        int result[] = new int[A.length];
        
        for(int i = 0; i < arraySize; i++){
            result[(i+K)%arraySize] = A[i];    
        }
        return result;
        
    }
}
