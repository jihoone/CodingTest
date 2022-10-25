//	다음 큰 숫자

package Level2;
import java.util.*;

public class Level2_24 {
	class Solution {
	    public int solution(int n) {
	        int answer = 0;
	        int cnt = 0;
	        char[] arr = Integer.toBinaryString(n).toCharArray();
	        
	        for(int i = 0; i < arr.length; i++){
	            if(arr[i] == '1') cnt++;
	        }
	        
	        int num = 1;
	        
	        while(true){
	            n += num;
	            int count = 0;
	            
	            char[] arr1 = Integer.toBinaryString(n).toCharArray();
	        
	            for(int i = 0; i < arr1.length; i++){
	                if(arr1[i] == '1') count++;
	            }
	            
	            if(cnt == count) {
	                String str = new String(arr1);
	                answer = Integer.parseInt(str, 2);
	                break;
	            }
	        }
	        
	        return answer;
	    }
	}
}
