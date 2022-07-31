//	K번째수

package coodingTest;
import java.util.Arrays;

public class Level1_13 {
	class Solution {
	    public int[] solution(int[] array, int[][] commands) {
	        int[] answer = new int[commands.length];
	        
	        for (int i = 0; i < commands.length; i++){
	            int[] arr = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
	            Arrays.sort(arr);
	            answer[i] = arr[commands[i][2] - 1];
	        }
	        
	        return answer;
	    }
	}
}
