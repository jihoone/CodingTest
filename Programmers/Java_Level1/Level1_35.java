//	서울에서 김서방 찾기

package coodingTest;

public class Level1_35 {
	class Solution {
	    public String solution(String[] seoul) {
	        String answer = "";
	        int index = 0;
	        
	        for(int i = 0; i < seoul.length; i++){
	            if(seoul[i].equals("Kim")){
	                index = i;
	            }
	        }
	        answer = "김서방은 " + index + "에 있다";
	        
	        return answer;
	    }
	}
}
