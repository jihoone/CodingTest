//	음양 더하기

package coodingTest;

public class Level1_8 {
	class Solution {
	    public int solution(int[] absolutes, boolean[] signs) {
	        int result = 0;
	        int[] arr = new int[signs.length];
	        
	        for (int i = 0; i < signs.length; i++){
	            if(signs[i] == true){
	                arr[i] = absolutes[i];
	            }
	            else{
	                arr[i] = -absolutes[i];
	            }
	            result += arr[i];
	        }
	        
	        return result;
	    }
	}
}
