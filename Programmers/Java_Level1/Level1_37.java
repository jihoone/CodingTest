//	수박수박수박수박수박수?

package coodingTest;

public class Level1_37 {
	class Solution {
	    public String solution(int n) {
	        String answer = "";
	        String[] arr = new String[n];
	        
	        for (int i = 0; i < n; i++){
	            if(i % 2 == 0) arr[i] = "수";
	            else arr[i] = "박";
	        }
	        
	        answer = String.join("", arr);
	        
	        return answer;
	    }
	}
}
