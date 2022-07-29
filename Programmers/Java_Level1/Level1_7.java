//	없는 숫자 더하기

package coodingTest;

public class Level1_7 {
	class Solution {
	    public int solution(int[] numbers) {
	        int sum = 0;
	        int result;
	        
	        for (int i = 0; i < numbers.length; i++){
	            sum += numbers[i];
	        }
	        result = 45 - sum;
	        return result;
	    }
	}
}
