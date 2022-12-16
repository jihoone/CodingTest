//	숫자 카드 나누기

package Level2;

public class Level2_28 {
	class Solution {
	    public int solution(int[] arrayA, int[] arrayB) {
	        int answer = 0;
	        
	        if(arrayA.length < 2){
	            if(arrayA[0] % arrayB[0] == 0) return answer;
	            else{
	                answer = Math.max(arrayA[0], arrayB[0]);
	                return answer;
	            }
	        }
	        
	        int num1 = arrayA[0];
	        int num2 = arrayA[1];
	        int nGcd = gcd(num1, num2);
	        
	        for(int i = 2; i < arrayA.length; i++){
	            nGcd = gcd(nGcd, arrayA[i]);
	        }
	        for(int i = 0; i < arrayB.length; i++){
	            if(arrayB[i] % nGcd == 0) {
	                nGcd = 0;
	                break;
	            }
	        }
	        
	        int num3 = arrayB[0];
	        int num4 = arrayB[1];
	        int nGcd1 = gcd(num3, num4);
	        
	        for(int i = 2; i < arrayB.length; i++){
	            nGcd1 = gcd(nGcd1, arrayB[i]);
	        }
	        for(int i = 0; i < arrayA.length; i++){
	            if(arrayA[i] % nGcd1 == 0) {
	                nGcd1 = 0;
	                break;
	            }
	        }
	        
	        answer = Math.max(nGcd, nGcd1);
	        
	        return answer;
		}

	    private int gcd(int max, int min){
	            while(min != 0){
	                int remain = max % min;
	                
	                max = min;
	                min = remain;
	            }
	        
	            return max;
	    }
	}
}
