//	완주하지 못한 선수

package coodingTest;
import java.util.*;

public class Level1_12 {

	class Solution {
	    public String solution(String[] participant, String[] completion) {
	        Arrays.sort(participant);
	        Arrays.sort(completion);
	        
	        for (int i = 0; i < completion.length; i++){
	            if(!participant[i].equals(completion[i])){
	                return participant[i];
	            }
	        }
	        
	        return participant[participant.length - 1];
	    }
	}
}
