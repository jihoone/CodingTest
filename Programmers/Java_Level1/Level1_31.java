//	문자열 내 마음대로 정렬하기

package coodingTest;
import java.util.*;

public class Level1_31 {
	class Solution {
	    public String[] solution(String[] strings, int n) {
	        String[] answer = {};
	        ArrayList<String> list = new ArrayList<String>();
	        
	        for (int i = 0; i < strings.length; i++){
	            list.add(strings[i].charAt(n) + strings[i]);
	        }
	        
	        Collections.sort(list);
	        
	        answer = new String[list.size()];
	        
	        for(int i = 0; i < list.size(); i++){
	            answer[i] = list.get(i).substring(1, list.get(i).length());
	        }
	        
	        return answer;
	    }
	}
}
