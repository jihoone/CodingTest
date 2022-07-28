//	크레인 인형뽑기 게임

package coodingTest;
import java.util.*;

public class Level1_6 {
	class Solution {
	    public int solution(int[][] board, int[] moves) {
	        int answer = 0;
	        ArrayList<Integer> arr = new ArrayList<Integer>();
	        int test = 0;
	        int cnt = 0;
	        
	        for (int i = 0; i < moves.length; i++){
	            int num = moves[i] - 1;
	            
	            for (int a = 0; a < board.length; a++){
	                if (board[a][num] != 0){
	                    test = board[a][num];
	                    board[a][num] = 0;
	                    break;
	                }
	            }
	            
	            if (test != 0) {
	                arr.add(test);
	            }
	            else continue;
	            
	            if (arr.size() > 1){
	                if (arr.get(cnt) == arr.get(cnt - 1)){
	                    answer += 2;
	                    arr.remove(cnt);
	                    arr.remove(cnt - 1);
	                    cnt -= 2;
	                }
	            }
	            cnt++;
	            test = 0;
	        }
	        
	        return answer;
	    }
	}
}
