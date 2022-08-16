//	정수 내림차순으로 배치하기

package coodingTest;
import java.util.Arrays;
import java.util.Collections;

public class Level1_44 {
	class Solution {
	    public long solution(long n) {
	        String num = String.valueOf(n);
			String[] arr = num.split("");
			
			Arrays.sort(arr, Collections.reverseOrder());
	        num = String.join("", arr);
			
	        long answer = Long.parseLong(num);
	        
	        return answer;
	    }
	}
}
