//	메뉴 리뉴얼

package Level2;
import java.util.*;
import java.util.Map.Entry;

public class Level2_11 {
	class Solution {
	    static HashMap<String, Integer> map;
	    
	    public static void comb(String str, StringBuilder sb, int index, int cnt, int n){
	        if(cnt == n){
	            map.put(sb.toString(), map.getOrDefault(sb.toString(), 0) + 1);
	            return;
	        }
	        
	        for(int i = index; i < str.length(); i++){
	            sb.append(str.charAt(i));
	            comb(str, sb, i + 1, cnt + 1, n);
	            sb.delete(cnt, cnt+1);
	        }
	    }
	    
	    public String[] solution(String[] orders, int[] course) {
	        ArrayList<String> answer = new ArrayList<>();
	        
	        for(int i = 0; i < orders.length; i++){
	            char[] cArr = orders[i].toCharArray();
	            Arrays.sort(cArr);
	            orders[i] = String.valueOf(cArr);
	        }
	        
	        for(int i = 0; i < course.length; i++){
	            map = new HashMap<>();
	            int max = Integer.MIN_VALUE;
	            
	            for(int j = 0; j < orders.length; j++){
	                StringBuilder sb = new StringBuilder();
	                
	                if(course[i] <= orders[j].length()) comb(orders[j], sb, 0, 0, course[i]);
	            }
	            
	            for(Entry<String, Integer> entry : map.entrySet()){
	                max = Math.max(max, entry.getValue());
	            }
	        
	            for(Entry<String, Integer> entry : map.entrySet()){
	                if(max >= 2 && entry.getValue() == max) answer.add(entry.getKey());
	            }
	        }
	        
	        String[] result = new String[answer.size()];
	        
	        for(int i = 0; i < answer.size(); i++){
	            result[i] = answer.get(i);
	        }
	        Arrays.sort(result);
	        
	        return result;
	    }
	}
}
