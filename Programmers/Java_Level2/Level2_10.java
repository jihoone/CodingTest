//	두 큐 합 같게 만들기

package Level2;
import java.util.*;

public class Level2_10 {
	class Solution {
	    public int solution(int[] queue1, int[] queue2) {
	        Queue<Integer> q1 = new ArrayDeque<>();
	        Queue<Integer> q2 = new ArrayDeque<>();
	        long s1 = 0, s2 = 0, sum = 0;
	        
	        for(int num : queue1){
	            q1.add(num);
	            s1 += num;
	        }
	        for(int num : queue2){
	            q2.add(num);
	            s2 += num;
	        }
	        sum = s1 + s2;
	        
	        if(sum % 2 != 0) return -1;
	        sum /= 2;
	        
	        int cnt1 = 0, cnt2 = 0, len = queue1.length * 2;
	        
	        while (cnt1 <= len && cnt2 <= len){
	            if(s1 == sum) return cnt1 + cnt2;
	            if(s1 > sum){
	                s1 -= q1.peek();
	                s2 += q1.peek();
	                q2.add(q1.poll());
	                cnt1++;
	            }
	            else{
	                s2 -= q2.peek();
	                s1 += q2.peek();
	                q1.add(q2.poll());
	                cnt2++;
	            }
	        }
	        return -1;
	    }
	}
}
