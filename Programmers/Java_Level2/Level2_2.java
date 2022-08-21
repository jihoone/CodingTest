//	기능개발

package Level2;
import java.util.*;

public class Level2_2 {
	class Solution {
	    public int[] solution(int[] progresses, int[] speeds) {
	        int[] arr = progresses.clone();
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        int index = 0;
	        
	        while (true){
	            for (int i = index; i < arr.length; i++){
	                arr[i] += speeds[i];
	            }
	            
	            if (arr[index] >= 100){
	                int cnt = 0;
	                
	                for (int i = index; i < arr.length; i++){
	                    if (arr[i] < 100) break;
	                    else cnt++;
	                }
	                
	                index = index + cnt;
	                list.add(cnt);
	            }
	            
	            if (index == arr.length) break;
	        }
	        
	        int[] answer = new int[list.size()];
	        
	        for (int i = 0; i < list.size(); i++){
	            answer[i] = list.get(i);
	        }
	        
	        
	        return answer;
	    }
	}
}
