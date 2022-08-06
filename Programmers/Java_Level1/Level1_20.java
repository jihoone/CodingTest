//	두 개 뽑아서 더하기

package coodingTest;
import java.util.*;

public class Level1_20 {
	class Solution {
	    public int[] solution(int[] numbers) {
	        List<Integer> list = new ArrayList<Integer>();
	        
	        for(int i = 0; i < numbers.length - 1; i++){
	            for (int j = i + 1; j < numbers.length; j++){
	                int num = numbers[i] + numbers[j];
	                if(list.indexOf(num) < 0) list.add(num);
	            }
	        }
	        
	        int[] answer = new int[list.size()];
	        
	        for (int i = 0; i < list.size(); i++){
	            answer[i] = list.get(i);
	        }
	        
	        Arrays.sort(answer);
	        return answer;
	    }
	}
}
