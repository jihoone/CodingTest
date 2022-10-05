//	주차 요금 계산

package Level2;
import java.util.*;

public class Level2_12 {
	class Solution {
	    public int[] solution(int[] fees, String[] records) {
	        int[] answer = {};
	        HashMap<String, String> map = new HashMap<>();
	        HashMap<String, Integer> feeMap = new HashMap<>();
	        
	        for(int i = 0; i < records.length; i++){
	            feeMap.put(records[i].split(" ")[1], 0);
	        }
	        
	        for(int i = 0; i < records.length; i++){
	            String[] info = records[i].split(" ");
	            
	            if(map.containsKey(info[1])){
	                String[] inTime = map.remove(info[1]).split(":");
	                String[] outTime = info[0].split(":");
	                
	                int hour = Integer.parseInt(outTime[0]) - Integer.parseInt(inTime[0]);
	                int min = Integer.parseInt(outTime[1]) - Integer.parseInt(inTime[1]);
	                
	                feeMap.replace(info[1], feeMap.get(info[1]) + 60 * hour + min);
	            }
	            else map.put(info[1], info[0]);
	        }
	        
	        for(String key : map.keySet()){
	            String[] inTime = map.get(key).split(":");
	            
	            int hour = 23 - Integer.parseInt(inTime[0]);
	            int min = 59 - Integer.parseInt(inTime[1]);
	            
	            feeMap.replace(key, feeMap.get(key) + 60 * hour + min);
	        }
	        
	        String[] arr = new String[feeMap.size()];
	        int index = 0;
	        answer = new int[feeMap.size()];

	        for(String key : feeMap.keySet()){
	            arr[index] = key;
	            index++;
	        }
	        
	        Arrays.sort(arr);
	        
	        for(int i = 0; i < answer.length; i++){
	            if(feeMap.get(arr[i]) > fees[0]){
	                answer[i] = fees[1] + (int)Math.ceil(((feeMap.get(arr[i]) - fees[0]) / (double)fees[2])) * fees[3];
	            }
	            else answer[i] = fees[1];
	        }
	        
	        return answer;
	    }
	}
}
