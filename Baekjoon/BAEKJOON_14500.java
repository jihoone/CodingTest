package baekjoon;

import java.util.Scanner;

public class BAEKJOON_14500 {
	static int N;
	static int M;
	static int[][] arr;
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, -1, 0, 1};
	static boolean[][] test;
	static int max;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		
		arr = new int[N][M];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		test = new boolean[N][M];
		max = 0;
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				DFS(i, j, 0, 0);
				EX(i, j);	
			}
		}
		
		System.out.println(max);
	}
	
	static void DFS(int x, int y, int depth, int sum) {
		if(depth == 4) {
			max = Math.max(max, sum);
			return;
		}
		
		for (int i = 0; i < 4; i++) {
			int nextX = x + dx[i];
			int nextY = y + dy[i];
			
            if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M) {
                continue;
            }
            if (test[nextX][nextY]) {
                continue;
            }
            
            test[nextX][nextY] = true;
            DFS(nextX, nextY, depth + 1, sum + arr[nextX][nextY]);
            test[nextX][nextY] = false;
		}
	}
	
	static void EX(int x, int y) {
        int point = 4;
        int min = Integer.MAX_VALUE;
        int sum = arr[x][y];
        
        for (int i = 0; i < 4; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];
 
            if (point <= 2) {
            	return;
            }
            if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M) {
                point--;
                continue;
            }
            
            min = Math.min(min, arr[nextX][nextY]);
            sum = sum + arr[nextX][nextY];
        }

        if (point == 4) {
            sum = sum - min;
        }
        
        max = Math.max(max, sum);
    }
}