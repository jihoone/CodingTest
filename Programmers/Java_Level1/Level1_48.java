//	최대공약수와 최소공배수

package coodingTest;

public class Level1_48 {
	class Solution {
	    public int[] solution(int n, int m) {
	        
	        int gcd = GCD(n, m);
	        int[] answer = {gcd, (n * m) / gcd};
	        
	        return answer;
	    }
	    public int GCD(int n, int m){
	        if(n % m == 0){
	            return m;
	        }
	        return GCD(m, n % m);
	    }
	}
}
