//	체육복

package coodingTest;
import java.util.Arrays;

public class Level1_15 {
	class Solution {
	    public int solution(int n, int[] lost, int[] reserve) {
	        int max = n - lost.length;
	        Arrays.sort(lost);
	        Arrays.sort(reserve);
	        
	        for(int i = 0; i < lost.length; i++){
	            for (int j = 0; j < reserve.length; j++){
	                if(lost[i] == reserve[j]){
	                    max++;
	                    lost[i] = reserve[j] = -1;
	                    break;
	                }
	            }
	        }
	        
	        for(int num : lost){
	            for(int i = 0; i < reserve.length; i++){
	                if(reserve[i] == num + 1 || reserve[i] == num -1){
	                    max++;
	                    reserve[i] = -1;
	                    break;
	                }
	            }
	        }
	        
	        return max;
	    }
	}
}
