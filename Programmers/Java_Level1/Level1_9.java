//	내적

package coodingTest;

public class Level1_9 {
	class Solution {
	    public int solution(int[] a, int[] b) {
	        int answer = 0;
	        
	        for (int i = 0; i < a.length; i++){
	            answer = answer + a[i] * b[i];
	        }
	        
	        return answer;
	    }
	}
}
