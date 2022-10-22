// 문자열 압축

package Level2;

public class Level2_17 {
	class Solution {
	    public int solution(String s) {
	        int answer = s.length();
	        int count = 1;
	        
	        for(int i = 1; i <= s.length() / 2; i++){
	            StringBuilder str = new StringBuilder();
	            String sample = s.substring(0, i);
	            
	            for(int j = i; j <= s.length(); j += i){
	                int end = Math.min(j + i, s.length());
	                String comp = s.substring(j, end);
	                
	                if(sample.equals(comp)) count++;
	                else{
	                    if(count >= 2){
	                        str.append(count);
	                    }
	                    str.append(sample);
	                    sample = comp;
	                    count = 1;
	                }
	            }
	            str.append(sample);
	            answer = Math.min(answer, str.length());
	        }
	        
	        return answer;
	    }
	}
}
