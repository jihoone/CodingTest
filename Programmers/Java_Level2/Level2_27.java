//	귤 고르기

package Level2;
import java.util.*;

public class Level2_27 {
	class Solution {
	    public int solution(int k, int[] tangerine) {
	        int answer = 0;
	        HashMap<Integer, Integer> map = new HashMap<>();
	        
	        for(int i = 0; i < tangerine.length; i++){
	            int num = tangerine[i];
	            
	            if(!map.containsKey(num)){
	                map.put(num, 1);
	            }
	            else{
	                int com = map.get(num) + 1;
	                map.put(num, com);
	            }
	        }
	        
	        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
	        entryList.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));

	        for (Map.Entry<Integer, Integer> entry : entryList) {
	            if(k <= 0) break;
	            answer++;
	            k -= entry.getValue();
	        }
	        
	        return answer;
	    }
	}
}
