//	멀쩡한 사각형

package Level2;

public class Level2_5 {
	class Solution {
	    public long solution(int w, int h) {
	        int min = (w < h) ? w : h;
	        int gcd = 0;
	        
	        for (int i = 1; i <= min; i++){
	            if (w % i == 0 && h % i == 0) gcd = i;
	        }
	        
	        long answer = (long)w * (long)h - ((((long)w/gcd) + ((long)h/gcd) - 1) * gcd);
	        
	        return answer;
	    }
	}
}
