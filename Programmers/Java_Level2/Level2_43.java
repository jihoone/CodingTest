//	연속된 부분 수열의 합

package Level2;

public class Level2_43 {
	class Solution {
	    public int[] solution(int[] sequence, int k) {
	        int[] answer = {0, sequence.length - 1};
	        int len = sequence.length;
	        int sum = 0;
	        
	        for(int first = 0, last = 0; first < sequence.length; first++){
	            while(last < len && sum < k){
	                sum += sequence[last++];
	            }
	            
	            if(sum == k) {
	                int range = last - first - 1;
	                
	                if((answer[1] - answer[0]) > range) {
	                    answer[0] = first;
	                    answer[1] = last - 1;
	                }
	            }
	            
	            sum -= sequence[first];
	        }
	        
	        return answer;
	    }
	}
}
