//	2 * n타일링

package Level2;

public class Level2_40 {
	class Solution {
	    public int solution(int n) {
	        int answer = 1;
	        int first = 1;
	        int last = 1;
	        
	        for(int i = 1; i < n; i++){
	            answer = (first + last) % 1000000007;
	            first = last;
	            last = answer;
	        }
	        
	        return answer;
	    }
	}
}
