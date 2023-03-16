//	숫자 변환하기

package Level2;
import java.util.*;

public class Level2_39 {
	class Solution {
	    public int solution(int x, int y, int n) {
	        int answer = 0;
	        Queue<Integer> q = new LinkedList<>();
	        Set<Integer> set = new HashSet<>();
	        
	        q.offer(x);
	        
	        while(!q.isEmpty()){
	            int len = q.size();
	            
	            for(int i = 0; i < len; i++){
	                if(q.peek() == y) return answer;
	                
	                conb(q.poll(), y, n, set, q);
	            }
	            answer++;
	        }
	        
	        return -1;
	    }
	    
	    public void conb(int num, int y, int n, Set<Integer> set, Queue<Integer> q){
	        if(num + n <= y && !set.contains(num + n)){
	            set.add(num + n);
	            q.offer(num + n);
	        }
	        if(num * 2 <= y && !set.contains(num * 2)){
	            set.add(num * 2);
	            q.offer(num * 2);
	        }
	        if(num * 3 <= y && !set.contains(num * 3)){
	            set.add(num * 3);
	            q.offer(num * 3);
	        }
	    }
	}
}
