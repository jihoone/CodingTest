//	디펜스 게임

package Level2;
import java.util.*;

public class Level2_25 {
	class Solution {
	    public int solution(int n, int k, int[] enemy) {
	        int answer = 0;
	        Queue<Integer> qu = new PriorityQueue<>(Collections.reverseOrder());
	        
	        for(int i = 0; i < enemy.length; i++){
	            n -= enemy[i];
	            qu.add(enemy[i]);
	            
	            if(n < 0){
	                if(k > 0 && !qu.isEmpty()){
	                    n += qu.poll();
	                    k--;
	                }
	                else break;
	            }
	            
	            answer++;
	        }
	        
	        return answer;
	    }
	}
}
