//	두 원 사이의 정수 쌍

package Level2;

public class Level2_42 {
	class Solution {
	    public long solution(int r1, int r2) {
	        long answer = 0;
	        long r1Size = (long)Math.pow(r1, 2);
	        long r2Size = (long)Math.pow(r2, 2);
	        long cnt = 0;

	        for(int i = 0; i <= r2; i++){
	            long y1 = (long)Math.sqrt(r1Size - Math.pow(i, 2));
	            long y2 = (long)Math.sqrt(r2Size - Math.pow(i, 2));
	            
	            if(Math.sqrt(r1Size - Math.pow(i, 2)) % 1 == 0) cnt++;
	            
	            answer += (y2 - y1) * 4;
	        }
	        answer += cnt * 4 - 4;
	        
	        return answer;
	    }
	}
}
