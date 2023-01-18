//	문자열 나누기

package Level1;

public class Level1_57 {
	class Solution {
	    public int solution(String s) {
	        int answer = 0;
	        
	        while(s.length() != 0){
	            char ch = s.charAt(0);
	            boolean bo = false;
	            int cnt = 1;
	            int nCnt = 0;
	            
	            for(int i = 1; i < s.length(); i++){
	                char c = s.charAt(i);
	                
	                if(ch == c) cnt++;
	                else nCnt++;
	                
	                if(cnt == nCnt){
	                    s = s.substring(i + 1);
	                    answer++;
	                    bo = true;
	                    break;
	                }
	            }
	            
	            if(bo == false) break;
	        }
	        
	        if(s.length() != 0) answer++;
	        
	        return answer;
	    }
	}
}
