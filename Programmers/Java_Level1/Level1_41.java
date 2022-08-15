//	이상한 문자 만들기

package coodingTest;

public class Level1_41 {
	class Solution {
	    public String solution(String s) {
	        int n = 0;
	        String[] arr = s.split("");
	        
	        for (int i = 0; i < arr.length; i++){
	            if(arr[i].equals(" ")){
	                n = 0;
	                continue;
	            }
	            else{
	                if (n % 2 == 0){
	                    arr[i] = arr[i].toUpperCase();
	                }
	                else{
	                    arr[i] = arr[i].toLowerCase();
	                }
	                n++;
	            }

	        }
	        s = String.join("", arr);
	        return (s);
	    }
	}
}
