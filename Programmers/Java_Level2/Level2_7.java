//	JadenCase 문자열 만들기

package Level2;

public class Level2_7 {
	class Solution {
	    public String solution(String s) {
	        String answer = "";
	        char[] ch = s.toCharArray();
	        int cnt = 0;
	        
	        for (int i = 0; i < ch.length; i++){
	            char one = ch[i];
	            
	            if (i == 0) {
	                ch[i] = Character.toUpperCase(one);
	                continue;
	            }
	            if (ch[i] == ' ') {
	                cnt++;
	                continue;
	            }
	            if(cnt != 0) {
	                ch[i] = Character.toUpperCase(one);
	                cnt = 0;
	                continue;
	            }
	            
	            ch[i] = Character.toLowerCase(one);
	        }
	        
	        answer = String.valueOf(ch);
	        
	        return answer;
	    }
	}
}
