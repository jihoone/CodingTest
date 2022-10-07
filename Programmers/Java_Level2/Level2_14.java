//	최댓값과 최솟값

package Level2;

public class Level2_14 {
	class Solution {
	    public String solution(String s) {
	        String answer = "";
	        String[] num = s.split(" ");
	        int min = Integer.parseInt(num[0]);
	        int max = Integer.parseInt(num[0]);
	        
	        for(int i = 1; i < num.length; i++){
	            int numb = Integer.parseInt(num[i]);
	            if(min > numb) min = numb;
	            if(max < numb) max = numb;
	        }
	    
	        answer = "" + min + " " + max;
	        return answer;
	    }
	}
}
