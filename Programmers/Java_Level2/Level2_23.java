//	가장 큰 정사각형 찾기

package Level2;

public class Level2_23 {
	class Solution{
	    public int solution(int[][] board) {
	        int answer = 0;
	        int[][] dp = new int[board.length][board[0].length];

	        for (int i = 0; i < board.length; i++) {
	            for (int j = 0; j < board[0].length; j++) {
	                dp[i][j] = board[i][j];
	            }
	        }

	        for (int i = 1; i < board.length; i++) {
	            for (int j = 1; j < board[0].length; j++) {
	                if (board[i][j] == 1) {
	                    dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1], dp[i - 1][j]), dp[i][j - 1]) + 1;
	                }
	            }
	        }

	        for (int i = 0; i < board.length; i++) {
	            for (int j = 0; j < board[0].length; j++) {
	                answer = Math.max(answer, dp[i][j]);
	            }
	        }
	        
	        return answer * answer;
	    }
	}
}
