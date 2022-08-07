//	최소직사각형

package coodingTest;

public class Level1_22 {
	class Solution {
	    public int solution(int[][] sizes) {
	        
	        int maxR;
	        int maxC;
	        int max = Math.max(sizes[0][0], sizes[0][1]);
	        int min = Math.min(sizes[0][0], sizes[0][1]);
	        
	        for(int i = 1; i < sizes.length; i++){
	            maxR = Math.max(sizes[i][0], sizes[i][1]);
	            maxC = Math.min(sizes[i][0], sizes[i][1]);
	            if (max < maxR){
	                max = maxR;
	            }
	            if(min < maxC){
	                min = maxC;
	            }
	        }
	            
	        int answer = max * min;
	        return answer;
	    }
	}
}
