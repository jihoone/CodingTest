package baekjoon;

import java.util.*;

public class BAEKJOON_1018 {

	public static int min = 64;
	public static boolean arr[][];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int N, M;
		N = sc.nextInt();
		M = sc.nextInt();

		arr = new boolean[N][M];
		
		sc.nextLine();

		for (int i = 0; i < N; i++) {
			String str = sc.nextLine();

			for (int j = 0; j < M; j++) {
				if (str.charAt(j) == 'W') {
					arr[i][j] = true;
				} else {
					arr[i][j] = false;
				}
			}
		}

		int row = N - 7;
		int col = M - 7;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				chess(i, j);
			}
		}

		System.out.println(min);
	}

	public static void chess(int x, int y) {
		int x_max = x + 8;
		int y_max = y + 8;
		int count = 0;

		boolean ches = arr[x][y];

		for (int i = x; i < x_max; i++) {
			for (int j = y; j < y_max; j++) {
				if (arr[i][j] != ches) {
					count++;
				}
				ches = (!ches);
			}
			ches = !ches;
		}

		count = Math.min(count, 64 - count);
		min = Math.min(min, count);
	}
}