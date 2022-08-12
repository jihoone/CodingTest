//	문자열 내림차순으로 배치하기

package coodingTest;
import java.util.Arrays;
import java.util.Collections;

public class Level1_33 {
	class Solution {
	    public String solution(String s) {
	        String answer = "";
	        String[] arr = s.split("");
	        
	        Arrays.sort(arr, Collections.reverseOrder());
	        answer = String.join("", arr);
	        
	        return answer;
	    }
	}
}
