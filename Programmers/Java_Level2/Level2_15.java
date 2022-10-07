//	피보나치 수

package Level2;
import java.util.*;

public class Level2_15 {
	class Solution {
	    public int solution(int n) {
	        int answer = 0;
	        ArrayList<Integer> list = new ArrayList<>();
	        list.add(0);
	        list.add(1);
	        
	        for(int i = 2; i <= n; i++){
	            int num = (list.get(i - 2) + list.get(i - 1)) % 1234567;
	            list.add(num);
	        }
	        
	        answer = list.get(n);
	        
	        return answer;
	    }
	}
}
