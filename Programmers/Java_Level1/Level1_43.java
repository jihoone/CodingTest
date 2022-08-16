//	자연수 뒤집어 배열로 만들기

package coodingTest;

public class Level1_43 {
	class Solution {
	    public int[] solution(long n) {

	        String num = String.valueOf(n);
	        
	        StringBuilder sb = new StringBuilder(num);
	        sb = sb.reverse();
	        
	        String[] result = sb.toString().split("");
	        int[] answer = new int[sb.length()];
	        
	        for (int i = 0; i < sb.length(); i++){
	            answer[i] = Integer.parseInt(result[i]);
	        }
	        
	        return answer;
	    }
	}
}
