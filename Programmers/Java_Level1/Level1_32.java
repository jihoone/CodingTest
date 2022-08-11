//	문자열 내 p와 y의 개수

package coodingTest;

public class Level1_32 {
	class Solution {
	    boolean solution(String s) {
	        
	        s = s.toLowerCase();
	        
	        String[] arr = s.split("");
	        String p ="p";
	        String y = "y";
	        int count = 0;
	        
	        for (int i = 0; i < arr.length; i++){
	            if(p.equals(arr[i])){
	                count++;
	            }
	            else if(y.equals(arr[i])){
	                count--;
	            }
	            else continue;
	        }
	        
	        if(count == 0) return true;
	        else return false;
	    }
	}
}
