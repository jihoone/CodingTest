//	같은 숫자는 싫어

package coodingTest;
import java.util.*;

public class Level1_28 {
	public class Solution {
	    public int[] solution(int []arr) {
	        int[] answer = new int[arr.length];
	        int num = arr[0];
	        int count = 1;
	        answer[0] = arr[0];
	        
	        for (int i = 1; i < arr.length; i++){
	            if(num == arr[i]){
	                continue;
	            }
	            else{
	                answer[count] = arr[i];
	                num = arr[i];
	                count++;
	            }
	        }
	        
	        int[] result = Arrays.copyOf(answer, count);
	        

	        return result;
	    }
	}
}
