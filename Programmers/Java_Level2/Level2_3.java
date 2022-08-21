//	올바른 괄호

package Level2;

public class Level2_3 {
	class Solution {
	    boolean solution(String s) {
	        boolean answer = true;
	        
	        if(s.charAt(0) == ')') return false;
	        
	        int cnt = 1;
	    
	        for(int i = 1; i < s.length(); i++){
	            if(s.charAt(i) == '(') cnt++;
	            else cnt--;
	            
	            if (cnt < 0) return false;
	        }
	        
	        if (cnt != 0) return false;
	        
	        return answer;
	    }
	}
}
