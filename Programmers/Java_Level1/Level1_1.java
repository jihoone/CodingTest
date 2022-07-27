//	신고 결과 받기

package coodingTest;
import java.util.*;

public class Level1_1 {
	class Solution {
	    public int[] solution(String[] id_list, String[] report, int k) {
	        int[] answer = new int[id_list.length];
	        Map<String, HashSet<String>> map = new HashMap<>();
	        Map<String, Integer> idxmap = new HashMap<>();
	        
	        for (int i = 0; i < id_list.length; i++){
	            String name = id_list[i];
	            map.put(name, new HashSet<>());
	            idxmap.put(name, i);
	        }
	        
	        for (String s : report){
	            String[] id = s.split(" ");
	            String from = id[0];
	            String to = id[1];
	            map.get(to).add(from);
	        }
	        
	        for (int i = 0; i < id_list.length; i++){
	            HashSet<String> send = map.get(id_list[i]);
	            if (send.size() >= k){
	                for (String name : send){
	                    answer[idxmap.get(name)]++;
	                }
	            }
	        }
	        
	        return answer;
	    }
	}
}
