//	요격 시스템

package Level2;
import java.util.*;

public class Level2_41 {
	class Solution {
	    public int solution(int[][] targets) {
	        int answer = 1;

	        Arrays.sort(targets, (o1, o2) -> {
	            return o1[0]-o2[0];
	        });
	        
	        int end = targets[0][1];
	        
	        for(int i = 1; i < targets.length; i++){
	            if(targets[i][0] < end){
	                if(end > targets[i][1]){
	                    end = targets[i][1];
	                }
	            }
	            else{
	                answer++;
	                end = targets[i][1];
	            }
	        }
	        
	        return answer;
	    }
	}
}
