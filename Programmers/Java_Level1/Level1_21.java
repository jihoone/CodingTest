//	2016년

package coodingTest;

public class Level1_21 {
	class Solution {
	    public String solution(int a, int b) {
	        String[] today = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
	        int[] month = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	        int sum = 0;
	        
	        for (int i = 0; i < a; i++){
	            sum += month[i];
	        }
	        sum += b;
	        
	        int result = sum % 7;
	        String answer = today[result];
	        
	        return answer;
	    }
	}
}
