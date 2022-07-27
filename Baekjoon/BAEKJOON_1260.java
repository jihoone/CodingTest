package baekjoon;

import java.io.*;
import java.util.*;

public class BAEKJOON_1260 {

	static int[][] check;
	static boolean[] checked;
	static int N;
	static int M;
	static int V;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		N = scanner.nextInt();
		M = scanner.nextInt();
		V = scanner.nextInt();
		
		check = new int[1001][1001];
		checked = new boolean[1001];
		
		for (int i = 0; i < M; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			
			check[x][y] = check[y][x] = 1;
		}
		
		dfs(V);
		
		checked = new boolean[1001];
		System.out.println();
		
		bfs(V);
	}

	public static void dfs(int i) {
		checked[i] = true;
		System.out.print(i + " ");
		
		for (int j = 1; j <= N; j++) {
			if (check[i][j] == 1 && checked[j] == false) {
				dfs(j);
			}
		}
	}
	
	public static void bfs(int i) {
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.offer(i);
		checked[i] = true;
		System.out.print(i + " ");
		
		while(!q.isEmpty()) {
			int temp = q.poll();
			
			for (int j = 1; j <= N; j++) {
				if(check[temp][j] == 1 && checked[j] == false) {
					q.offer(j);
					checked[j] = true;
					System.out.print(j + " ");
				}
			}
		}
		
	}
}
