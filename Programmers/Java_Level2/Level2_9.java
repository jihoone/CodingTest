//	이진 변환 반복하기

package Level2;

public class Level2_9 {
	class Solution {
	    public int[] solution(String s) {
	        int[] answer = new int[2];
	        
	        while (true){
	            int oCnt = 0;
	            
	            for (int i = 0; i < s.length(); i++){
	                if (s.charAt(i) == '0') answer[1]++;
	                else oCnt++;
	            }
	            
	            s = Integer.toBinaryString(oCnt);
	            answer[0]++;
	            
	            if (s.length() == 1) break;
	        }
	        
	        return answer;
	    }
	}
}
