//	부족한 금액 계산하기

package coodingTest;

public class Level1_24 {
	class Solution {
	    public long solution(int price, long money, int count) {
	        long math = 0;
	        long result;
	        
	        for (int i = 1; i <= count; i++){
	            math += price * i;
	        }
	        
	        result = math - money;
	        if(money > math) return 0;
	        else return result;
	    }
	}
}
