//	점 찍기

package Level2;

public class Level2_26 {
	class Solution {
	    public long solution(int k, int d) {
	        long answer = 0;
	        
	        for(int i = 0; i <= d / k; i++){
	            long x = i * k;
	            long y = (long)(Math.sqrt(Math.pow(d, 2) - Math.pow(x, 2))) / k;
	            
	            answer += y + 1;
	        }
	        
	        return answer;
	    }
	}
}
