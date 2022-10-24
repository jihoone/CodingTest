//	최솟값 만들기

package Level2;
import java.util.*;

public class Level2_21 {
	class Solution{
	    public int solution(int []A, int []B){
	        int answer = 0;
	        int index = A.length - 1;
	        
	        Arrays.sort(A);
	        Arrays.sort(B);
	        
	        for(int i = 0; i < A.length; i++){
	            answer += A[i] * B[index];
	            index--;
	        }

	        return answer;
	    }
	}
}
