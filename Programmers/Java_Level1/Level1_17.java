//	약수의 개수와 덧셈

package coodingTest;

public class Level1_17 {
	class Solution {
	    public int solution(int left, int right) {
	        int answer = 0;
	        int count = 0;
	        
	        for (int i = 0; i < right - left + 1; i++){
	            int num = left + i;
	            
	            for (int j = 1; j <= num; j++){
	                if (num % j == 0) count++;
	            }
	            
	            if(count % 2 == 0) answer += num;
	            else answer -= num;
	            
	            count = 0;
	        }
	        
	        return answer;
	    }
	}
}
