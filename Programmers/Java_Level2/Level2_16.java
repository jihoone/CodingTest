// 롤케이크 자르기

package Level2;
import java.util.*;

public class Level2_16 {
	class Solution {
	    public int solution(int[] topping) {
	        int answer = 0;
	        Map<Integer, Integer> map = new HashMap<>();
	        Map<Integer, Integer> map1 = new HashMap<>();
	        
	        for(int i = 0; i < topping.length; i++){
	            int num = topping[i];
	            
	            if(map.containsKey(num)) map.put(num, map.get(num) + 1);
	            else{
	                map.put(num, 1);
	            }
	        }
	        
	        for(int i = 0; i < topping.length; i++){
	            int num = topping[i];
	            
	            map1.put(num, 1);
	            map.put(num, map.get(num) - 1);
	            if(map.get(num) == 0) map.remove(num);
	            if(map.size() == map1.size()) answer++;
	        }
	        
	        return answer;
	    }
	}
}
