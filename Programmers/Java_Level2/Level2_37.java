//	프린터

package Level2;
import java.util.*;

public class Level2_37 {
	class Solution {
	    public int solution(int[] priorities, int location) {
	        int answer = 0;
	        int len = priorities.length;
	        Queue<Integer> queue = new LinkedList<>();
	        
	        for(int i = 0; i < priorities.length; i++){
	            queue.offer(priorities[i]);
	        }
	        
	        while(!queue.isEmpty()){
	            int pivot = queue.poll();
	            boolean bo = true;
	            
	            for(int i = 0; i < queue.size(); i++){
	                int num = queue.poll();
	                
	                if(num > pivot) bo = false;
	                 
	                queue.offer(num);
	            }
	            
	            if(bo == false){
	                queue.offer(pivot);
	                if(location == 0) location = len - 1;
	                else location--;
	            }
	            else{
	                answer++;
	                if(location == 0) break;
	                location--;
	                len--;
	            }
	        }
	        
	        return answer;
	    }
	}
}
