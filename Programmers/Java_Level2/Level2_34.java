//	N개의 최소공배수

package Level2;

public class Level2_34 {
	class Solution {
	    public int solution(int[] arr) {
	        int answer = 0;
	        
	        int start = arr[0];
	        int next = arr[1];
	        int nGcd = gcd(start, next);
	        answer = start * next / nGcd;
	        
	        for(int i = 2; i < arr.length; i++){
	            nGcd = gcd(answer, arr[i]);
	            answer = answer * arr[i] / nGcd;
	        }
	        
	        return answer;
	    }
	    
	    private int gcd(int max, int min){
		    while(min != 0){
		        int remain = max % min;
		                
		        max = min;
		        min = remain;
		    }
		        
		    return max;
		}
	}
}
