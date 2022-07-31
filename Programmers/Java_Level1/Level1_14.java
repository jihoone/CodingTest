//	모의고사

package coodingTest;
import java.util.*;

public class Level1_14 {
	class Solution {
	    public int[] solution(int[] answers) {
	        int[] answer = {};
	        int[] arr1 = {1, 2, 3, 4, 5};
	        int[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5};
	        int[] arr3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
	        int cnt1 = 0;
	        int cnt2 = 0;
	        int cnt3 = 0;
	        int a = 0;
	        int b = 0;
	        int c = 0;
	        
	        for(int i = 0; i < answers.length; i++){
	            if(answers[i] == arr1[a]) {
	                cnt1++;
	            }
	            if(answers[i] == arr2[b]) {
	                cnt2++;
	            }
	            if(answers[i] == arr3[c]) {
	                cnt3++;
	            }
	            
	            a++;
	            b++;
	            c++;
	            if(a == arr1.length) a = 0;
	            if(b == arr2.length) b = 0;
	            if(c == arr3.length) c = 0;
	        }
	        
	        int max = Math.max(Math.max(cnt1, cnt2), cnt3);
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        
	        if(max == cnt1) list.add(1);
	        if(max == cnt2) list.add(2);
	        if(max == cnt3) list.add(3);
	        
	        answer = new int[list.size()];
	        
	        for(int i = 0; i < answer.length; i++){
	            answer[i] = list.get(i);
	        }
	        
	        return answer;
	    }
	}
}
