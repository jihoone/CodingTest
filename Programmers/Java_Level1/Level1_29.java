//	나누어 떨어지는 숫자 배열

package coodingTest;
import java.util.Arrays;

public class Level1_29 {
	class Solution {
	    public int[] solution(int[] arr, int divisor) {
	        int[] answer = new int[arr.length];
	        int count = 0;
	        
	        for(int i = 0; i < arr.length; i++){
	            if(arr[i] % divisor == 0){
	                answer[count] = arr[i];
	                count++;
	            }
	        }
	        
	        int[] result = new int[count];
	        int[] result1 = {-1};
	        
	        if (count == 0) return result1;
	        
	        result = Arrays.copyOf(answer, count);
	        Arrays.sort(result);
	        
	        return result;
	    }
	}
}
