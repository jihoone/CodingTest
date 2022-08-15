//	약수의 합

package coodingTest;

public class Level1_40 {
	class Solution {
	    public int solution(int n) {
	        int answer = 0;
	        
	        for(int i = 1; i <= n; i++){
	            if(n % i == 0){
	                answer += i;
	            }
	        }
	        
	        return answer;
	    }
	}
}
