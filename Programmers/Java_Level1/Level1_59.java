//	크기가 작은 부분문자열

package Level1;

public class Level1_59 {
	class Solution {
	    public int solution(String t, String p) {
	        int answer = 0;

	        for(int i = 0; i < t.length() - p.length() + 1; i++){
	            if(Long.parseLong(t.substring(i, i + p.length())) <= Long.parseLong(p)) answer++;
	        }
	        
	        return answer;
	    }
	}
}
