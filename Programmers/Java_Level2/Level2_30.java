//	할인 행사

package Level2;
import java.util.*;

public class Level2_30 {
	class Solution {
	    public int solution(String[] want, int[] number, String[] discount) {
	        int answer = 0;
	        HashMap<String, Integer> baseMap = new HashMap<>();
	        HashMap<String, Integer> map = new HashMap<>();
	        
	        for(int i = 0; i < want.length; i++){
	            baseMap.put(want[i], number[i]);
	            map.put(want[i], 0);
	        }
	        
	        int index = 0;
	        
	        while(true){
	            if(index + 10 > discount.length) break;
	            HashMap<String, Integer> tMap = new HashMap<>(map);
	            boolean bo = true;
	            
	            for(int i = index; i < index + 10; i++){
	                String str = discount[i];
	                
	                if(!tMap.containsKey(str)) {
	                    bo = false;
	                    break;
	                }
	                int num = tMap.get(str) + 1;
	                tMap.put(str, num);
	            }
	            
	            if(bo == true){
	                for(int i = 0; i < want.length; i++){
	                    String st = want[i];
	                
	                    if(baseMap.get(st) != tMap.get(st)) {
	                        bo = false;
	                        break;
	                    }
	                }
	            }
	            
	            if(bo == true) answer++;
	            index++;
	        }
	        
	        return answer;
	    }
	}
}
