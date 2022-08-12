//	문자열 다루기 기본

package coodingTest;

public class Level1_34 {
	class Solution {
	    public boolean solution(String s) {
	        boolean answer = true;
	        String[] arr = s.split("");
	        String[] test = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
	        int num = 0;
	        
	        if(arr.length == 4 || arr.length == 6){
	            for(int i = 0; i < arr.length; i++){
	                for(int j = 0; j < test.length; j++){
	                    if(arr[i].equals(test[j])){
	                        num++;
	                        break;
	                    }
	                }
	                if(num == 0) answer = false;
	                num = 0;
	            }
	        }
	        else answer = false;
	        
	        return answer;
	    }
	}
}
