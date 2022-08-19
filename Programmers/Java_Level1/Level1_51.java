//	하샤드 수

package coodingTest;

public class Level1_51 {
	class Solution {
	    public boolean solution(int x) {
	        boolean answer = true;
	        String xString = Integer.toString(x);
	        String[] xArr = xString.split("");
	        int num = 0;
	        
	        for (int i = 0; i < xArr.length; i++){
	            num += Integer.parseInt(xArr[i]);
	        }
	        
	        if(x % num == 0){
	            return answer;
	        }
	        
	        return false;
	    }
	}
}
