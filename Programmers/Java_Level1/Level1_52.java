//	핸드폰 번호 가리기

package coodingTest;

public class Level1_52 {
	class Solution {
	    public String solution(String phone_number) {
	        String[] arr = phone_number.split("");
	        
	        for (int i = 0; i < arr.length - 4; i++){
	            arr[i] = "*";
	        }
	        phone_number = String.join("",arr);
	        
	        return phone_number;
	    }
	}
}
