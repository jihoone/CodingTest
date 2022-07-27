//	로또의 최고 순위와 최저 순위

package coodingTest;
import java.util.*;

public class Level1_2 {

	class Solution {
	    public int[] solution(int[] lottos, int[] win_nums) {
	        int[] answer = new int[2];
	        int count = 0;
	        int correct = 0;
	        
	        Arrays.sort(lottos);
	        
	        for (int i = 0; i < lottos.length; i++){
	            if (lottos[i] == 0) count++;
	        }
	        
	        int[] arr = Arrays.copyOfRange(lottos, count, lottos.length);
	        
	        for (int i = 0; i < arr.length; i++){
	            for (int num : win_nums){
	                if(num == arr[i]) correct++;
	            }
	        }
	        
	        answer[0] = 7 - correct - count;
	        answer[1] = 7 - correct;
	        
	        if(answer[0] >= 6) answer[0] = 6;
	        if(answer[1] >= 6) answer[1] = 6;
	        
	        return answer;
	    }
	}
}
