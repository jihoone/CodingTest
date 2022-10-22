//	[1차] 프렌즈4블록

package Level2;
import java.util.*;

public class Level2_18 {
	class Solution {
	    public int solution(int m, int n, String[] board) {
	        int answer = 0;
	        char[][] map = new char[m][n];
	        
	        for(int i = 0; i < m; i++){
	            map[i] = board[i].toCharArray();
	        }
	        
	        while(true){
	            int cnt = check(m, n, map);
	            
	            if(cnt == 0) break;
	            answer += cnt;
	            
	            dropB(m, n, map);
	        }
	        
	        return answer;
	    }
	    
	    private int check(int m, int n, char[][] map){
	        int cnt = 0;
	        boolean[][] checked = new boolean[m][n];
	        
	        for(int i = 0; i < m - 1; ++i){
	            for(int j = 0; j < n - 1; ++j){
	                if(map[i][j] == '.') continue;
	                checkF(map, checked, i, j);
	            }
	        }
	        
	        for(int i = 0; i < m; ++i){
	            for(int j = 0; j < n; ++j){
	                if(checked[i][j]){
	                    cnt++;
	                    map[i][j] = '.';
	                }
	            }
	        }
	        
	        return cnt;
	    }
	    
	    private void checkF(char[][] map, boolean[][] checked, int i, int j){
	        char block = map[i][j];
	        
	        for(int k = i; k < i + 2; ++k){
	            for(int l = j; l < j + 2; ++l){
	                if(map[k][l] != block) return;
	            }
	        }
	        
	        for(int k = i ; k < i + 2 ; ++k) {
				for(int l = j ; l < j + 2 ; ++l) {
					checked[k][l] = true;
				}
			}
	    }
	    
	    private void dropB(int m, int n, char[][] map) {
			for(int c = 0; c < n; ++c) {
				for(int r = m - 1; r >= 0; --r) {
					if(map[r][c] == '.') {
						for(int nr = r - 1 ; nr >= 0 ; --nr) {
							if(map[nr][c] != '.') {
								map[r][c] = map[nr][c];
								map[nr][c] = '.';
								break;
							}
						}
					}
				}
			}
		}
	}
}
