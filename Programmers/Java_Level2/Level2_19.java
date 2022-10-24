//	영어 끝말잇기

package Level2;
import java.util.*;

public class Level2_19 {
	class Solution {
	    public int[] solution(int n, String[] words) {
	        int[] answer = {0, 0};
	        ArrayList<String> list = new ArrayList<>();
	        int people = 2;
	        int index = 1;
	        String st = words[0];
	        list.add(st);
	        char[] c = st.toCharArray();
	        char start = c[c.length - 1];
	        
	        for(int i = 1; i < words.length; i++){
	            String str = words[i];
	            char[] ch = str.toCharArray();
	            char first = ch[0];
	            char last = ch[ch.length - 1];
	            
	            if(list.contains(str)){
	                answer[0] = people;
	                answer[1] = index;
	                break;
	            }
	            
	            if(start == first) start = last;
	            else{
	                answer[0] = people;
	                answer[1] = index;
	                break;
	            }
	            
	            people++;
	            list.add(str);
	            
	            if(people == n + 1) {
	                people = 1;
	                index++;
	            }
	        }

	        return answer;
	    }
	}
}
