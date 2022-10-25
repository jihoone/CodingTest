//	연속 부분 수열 합의 개수

package Level2;
import java.util.*;

public class Level2_22 {
	class Solution {
	    public int solution(int[] elements) {
	        int answer = 0;
	        Set<Integer> set = new HashSet<>();      
	        int index = 0;
	        int cnt = 0;
	        
	        while(true){
	            int sum = 0;
	            
	            for(int i = index; i < elements.length; i++){
	                sum += elements[i];
	                set.add(sum);
	                cnt++;
	                
	                if(cnt == elements.length) break;
	                if(i == elements.length - 1 && cnt != elements.length) {
	                    i = -1;
	                }
	            }
	            
	            cnt = 0;
	            index++;
	            if(index == elements.length) break;
	        }
	        
	        answer = set.size();
	        
	        return answer;
	    }
	}
}
