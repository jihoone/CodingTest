//	택배상자

package Level2;
import java.util.*;

public class Level2_29 {
	class Solution {
	    public int solution(int[] order) {
	        int answer = 0;
	        Stack<Integer> stack = new Stack<>();
	        int index = 0;
	        int pivot = 1;
	        
	        while(true){
	            if(!stack.isEmpty() && stack.peek() == order[index]){
	                answer++;
	                index++;
	                stack.pop();
	                continue;
	            }
	            
	            if(pivot > order.length) break;
	            
	            if(pivot == order[index]){
	                answer++;
	                index++;
	                pivot++;
	                continue;
	            }
	            
	            stack.push(pivot);
	            pivot++;
	        }
	        
	        return answer;
	    }
	}
}
