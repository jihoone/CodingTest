//	덧칠하기

package Level2;

public class Level2_38 {
	class Solution {
	    public int solution(int n, int m, int[] section) {
	        int answer = 0;
	        int[] arr = new int[n];
	        
	        for(int i = 0; i < arr.length; i++) arr[i] = 1;
	        
	        for(int i = 0 ; i < section.length; i++){
	            int num = section[i];

	            arr[num - 1] =0;
	        }
	        
	        int index = 0;

	        while(true){
	            if(index + m == n) break;
	            
	            int num = arr[index];
	            
	            if(num == 1){
	                index++;
	                continue;
	            }
	            
	            for(int i = index ; i < index + m; i++){
	                arr[i] = 1;
	            }         

	            answer++;
	        }
	        
	        for(int i = index; i < arr.length; i++){
	            if(arr[i] == 0){
	                answer++;
	                break;
	            }
	        }
	        
	        return answer;
	    }
	}
}
