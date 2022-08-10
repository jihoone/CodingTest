//	[1차] 다트 게임

package coodingTest;

public class Level1_27 {
	class Solution {
	    public int solution(String dartResult) {
	        int answer = 0;
	        String[] arr = dartResult.split("");
	        int[] ans = new int[3];
	        int index = -1;
	        
	        for (int i = 0; i < arr.length; i++){
	            if (arr[i].equals("S")) continue;
	            else if (arr[i].equals("D")) ans[index] *= ans[index];
	            else if (arr[i].equals("T")) ans[index] *= ans[index] * ans[index];
	            else if (arr[i].equals("*")){
	                if (index == 0) ans[index] *= 2;
	                else{
	                    ans[index - 1] *= 2;
	                    ans[index] *= 2;
	                }
	            }
	            else if (arr[i].equals("#")) ans[index] *= -1;
	            else{
	                if (!arr[i + 1].equals("0")){
	                    index++;
	                    ans[index] = Integer.parseInt(arr[i]);
	                }
	                else{
	                    index++;
	                    i++;
	                    ans[index] = 10;
	                }
	            }
	        }
	        
	        for (int i = 0; i < ans.length; i++){
	            answer += ans[i];
	        }
	        
	        return answer;
	    }
	}
}
