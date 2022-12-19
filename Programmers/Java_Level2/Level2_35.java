//	큰 수 만들기

package Level2;

public class Level2_35 {
	class Solution {
	    public String solution(String number, int k) {
	        StringBuilder answer = new StringBuilder("");
	        int len  = number.length() - k;
	        int start = 0;
	        
	        while(start < number.length() && answer.length() != len){
	            int left = k + answer.length() + 1;
	            int max = 0;
	            
	            for(int i = start; i < left; i++){
	                if(max < number.charAt(i) - '0'){
	                    max = number.charAt(i) - '0';
	                    start = i + 1;
	                }
	            }
	            answer.append(max);
	        }
	        
	        return answer.toString();
	    }
	}
}
