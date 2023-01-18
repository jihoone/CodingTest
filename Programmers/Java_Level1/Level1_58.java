//	햄버거 만들기

package Level1;
import java.util.*;

public class Level1_58 {
	class Solution {
	    public int solution(int[] ingredient) {
	        int answer = 0;
	        Stack<Integer> stack = new Stack<Integer>();
	        
	        for(int in : ingredient){
	            stack.push(in);
	            
	            if(stack.size() >= 4){
	                if(stack.get(stack.size() - 4) == 1
	                  && stack.get(stack.size() - 3) == 2
	                  && stack.get(stack.size() - 2) == 3
	                  && stack.get(stack.size() - 1) == 1){
	                    answer++;
	                    stack.pop();
	                    stack.pop();
	                    stack.pop();
	                    stack.pop();
	                }
	            }
	        }
	        
	        return answer;
	    }
	}
}
