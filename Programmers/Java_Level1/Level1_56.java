//	콜라 문제

package Level1;

public class Level1_56 {
	class Solution {
	    public int solution(int a, int b, int n) {
	        int answer = 0;
	        
	        while(true){
	            if(n < a) break;
	            if(n % a == 0){
	                n = (n / a) * b;
	                answer += n;
	            }
	            else{
	                int tmp = n % a;
	                
	                n = (n / a) * b;
	                answer += n;
	                n += tmp;
	            }
	        }
	        
	        return answer;
	    }
	}
}
