//	자릿수 더하기

package coodingTest;

public class Level1_42 {
	public class Solution {
	    public int solution(int n) {
	        int answer = 0;
	        String num = Integer.toString(n);
	        
	        String[] arr = num.split("");
	        int[] arrN = new int[arr.length];
	        
	        for (int i = 0; i < arr.length; i++){
	            arrN[i] = Integer.parseInt(arr[i]);
	            answer += arrN[i];
	        }

	        return answer;
	    }
	}
}
