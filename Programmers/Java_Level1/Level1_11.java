//	포켓몬

package coodingTest;
import java.util.*;

public class Level1_11 {
	class Solution {
	    public int solution(int[] nums) {
	        int max = nums.length / 2;
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        
	        for (int i = 0; i < nums.length; i++){
	            if(list.size() < max){
	                if(!list.contains(nums[i])) list.add(nums[i]);
	            }
	        }
	        
	        return list.size();
	    }
	}
}
