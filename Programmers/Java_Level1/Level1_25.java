//	[1차] 비밀지도

package coodingTest;
import java.util.*;

public class Level1_25 {
	class Solution {
	    public String[] solution(int n, int[] arr1, int[] arr2) {
	        String[] answer = new String[n];
	        
	        for (int i = 0; i < n; i++){
	            String str1 = Integer.toBinaryString(arr1[i]);
	            String str2 = Integer.toBinaryString(arr2[i]);
	            String[] arr1N = str1.split("");
	            String[] arr2N = str2.split("");
	            ArrayList<String> list1 = new ArrayList<String>(Arrays.asList(arr1N));
	            ArrayList<String> list2 = new ArrayList<String>(Arrays.asList(arr2N));
	            String[] test = new String[n];
	            int len1 = list1.size();
	            int len2 = list2.size();
	            
	            if (len1 != n){
	                for (int j = 0; j < n - len1; j++){
	                    list1.add(0, "0");
	                }
	            }
	            if (len2 != n){
	                for (int j = 0; j < n - len2; j++){
	                    list2.add(0, "0");
	                }
	            }
	            
	            for (int j = 0; j < list1.size(); j++){
	                if (list1.get(j).equals("1")) test[j] = "#";
	                else test[j] = " ";
	            }
	            
	            for (int j = 0; j < list2.size(); j++){
	                if (test[j].equals("#")) continue;
	                else{
	                    if (list2.get(j).equals("1")) test[j] = "#";
	                    else test[j] = " ";
	                }
	            }
	            
	            String ans = String.join("", test);
	            answer[i] = ans;
	        }
	        
	        return answer;
	    }
	}
}
