//	짝지어 제거하기

package Level2;
import java.util.*;

public class Level2_6 {
	class Solution
	{
	    public int solution(String s)
	    {
	        int answer = -1;
	        Stack<Character> stack = new Stack<Character>();
	        
	        stack.push(s.charAt(0));
	        
	        for (int i = 1; i < s.length(); i++){
	            if(stack.isEmpty()){
	                stack.push(s.charAt(i));
	                continue;
	            }
	            if(stack.peek() == s.charAt(i)) stack.pop();
	            else{
	                stack.push(s.charAt(i));
	            }
	        }
	        
	        answer = stack.size() == 0 ? 1 : 0;

	        return answer;
	    }
	}
}
