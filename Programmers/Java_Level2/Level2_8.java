//	더 맵게

package Level2;
import java.util.*;

public class Level2_8 {
	class Solution {
	    public int solution(int[] scoville, int K) {
	        int answer = 0;
	        PriorityQueue<Integer> heap = new PriorityQueue();
	        
	        for(int num : scoville) heap.offer(num);
	        
	        while(heap.peek() <= K){
	            if(heap.size() == 1) return -1;
	            int num1 = heap.poll();
	            int num2 = heap.poll();
	            int result = num1 + (num2 * 2);
	            
	            heap.offer(result);
	            answer++;
	        }
	        
	        return answer;
	    }
	}
}
