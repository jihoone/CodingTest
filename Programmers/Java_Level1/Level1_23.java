//	나머지가 1이 되는 수 찾기

package coodingTest;

public class Level1_23 {
	class Solution {
	    public int solution(int n) {
	        int answer = 1;
	        int num;
	        
	        while(true){
	            num = n % answer;
	            if (num == 1){
	                return answer;
	            }
	            answer++;
	        }
	    }
	}
}
