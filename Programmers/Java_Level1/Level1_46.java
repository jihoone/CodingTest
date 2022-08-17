//	제일 작은 수 제거하기

package coodingTest;

public class Level1_46 {
	class Solution {
	    public int[] solution(int[] arr) {
	        if(arr.length == 1){
	            return new int[] {-1};
	        }
	        
	        int count = 0;
	        
	        for(int i = 0; i < arr.length; i++){
	            if(arr[count] > arr[i]){
	                count = i;
	            }
	        }
	        
	        int[] answer = new int[arr.length - 1];
	        int cnt = 0;
	        
	        for(int i = 0; i < arr.length; i++){
	            if(i == count) continue;
	            answer[cnt++] = arr[i];
	        }
	        return answer;
	    }
	}
}
