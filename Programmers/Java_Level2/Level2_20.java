//	숫자의 표현

package Level2;

public class Level2_20 {
	class Solution {
	    public int solution(int n) {
	        int answer = 0;
	        int index = 1;
	        
	        while(true){
	            int num = 0;
	            
	            for(int i = index; i <= n; i++){
	                num += i;
	                if(num == n){
	                    answer++;
	                    break;
	                }
	                if(num > n) break;
	            }
	            
	            index++;
	            if(index > n) break;
	        }
	        
	        return answer;
	    }
	}
}
