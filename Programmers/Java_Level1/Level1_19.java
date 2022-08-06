//	예산

package coodingTest;
import java.util.*;

public class Level1_19 {
	class Solution {
	    public int solution(int[] d, int budget) {
	        int answer = 0;
	        int sum = 0;
	        
	        Arrays.sort(d);
	        
	        for (int i = 0; i < d.length; i++){
	            sum += d[i];
	            
	            if(sum <= budget){
	                answer++;
	            }
	            else break;
	        }
	        
	        return answer;
	    }
	}
}
