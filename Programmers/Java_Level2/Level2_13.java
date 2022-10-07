//	괄호 회전하기

package Level2;
import java.util.*;

public class Level2_13 {
	class Solution {
	    public int solution(String s) {
	        int answer = 0;
	        char[] chArr = s.toCharArray();
	        
	        for(int i = 0; i < chArr.length; i++){
	            Stack<Character> stack = new Stack<>();
	            int index = i;
	            
	            for(int j = 0; j < chArr.length; j++){
	                if(index == chArr.length) index = 0;
	                char ch = chArr[index];
	                
	                if(stack.isEmpty()) stack.push(ch);
	                else{
	                    if(ch == ')'){
	                        if(stack.peek() == '(') stack.pop();
	                        else stack.push(ch);
	                    }
	                    else if(ch == '}'){
	                        if(stack.peek() == '{') stack.pop();
	                        else stack.push(ch);
	                    }
	                    else if(ch == ']'){
	                        if(stack.peek() == '[') stack.pop();
	                        else stack.push(ch);
	                    }
	                    else stack.push(ch);
	                }
	                
	                index++;
	            }
	            
	            if(stack.isEmpty()) answer++;
	        }
	        
	        
	        return answer;
	    }
	}
}
