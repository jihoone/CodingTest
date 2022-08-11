//	두 정수 사이의 합

package coodingTest;

public class Level1_30 {
	class Solution {
	    public long solution(int a, int b) {
	        long answer = 0;
	        int max = Math.max(a, b);
	        int min = Math.min(a, b);
	        
	        for(int i = min; i <= max; i++){
	            answer += i;
	        }
	        
	        return answer;
	    }
	}
}
