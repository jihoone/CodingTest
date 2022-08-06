//	3진법 뒤집기

package coodingTest;

public class Level1_18 {
	class Solution {
	    public int solution(int n) {
	        int answer = 0;
	        String Snum = Integer.toString(n, 3);
	        String[] arr = Snum.split("");
	        String[] re = new String[arr.length];
	        int index = 0;
	        
	        for (int i = arr.length - 1; i >= 0; i--){
	            re[index] = arr[i];
	            index++;
	        }
	        
	        Snum = String.join("", re);
	        
	        answer = Integer.parseInt(Snum, 3);
	        
	        return answer;
	    }
	}
}
