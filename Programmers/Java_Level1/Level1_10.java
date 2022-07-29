//	소수 만들기

package coodingTest;

public class Level1_10 {
	class Solution {
	    public int solution(int[] nums) {
	        int answer = 0;
	        
	        for(int i = 0; i < nums.length - 2; i++){
	            for(int j = i + 1; j < nums.length - 1; j++){
	                for(int k = j + 1; k < nums.length; k++){
	                    if(test(nums[i] + nums[j] + nums[k])) answer++;
	                }
	            }
	        }

	        return answer;
	    }
	    
	    public Boolean test(int num){
	        int cnt = 0;
	        
	        for(int i = 1; i <= Math.sqrt(num); i++){
	            if(num % i == 0) cnt++;
	        }
	        
	        return cnt == 1;
	    }
	}
}
