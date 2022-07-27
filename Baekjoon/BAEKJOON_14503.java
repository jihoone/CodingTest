package baekjoon;

import java.util.Scanner;

public class BAEKJOON_14503 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// r - �������� ������ĭ ��
		// c - �������� ������ĭ�� 
		// (r, c)�� ǥ��
		// d = 0 - ��, 1 - ��, 2 - ��, 3 - ��
		// ���� - N, ���� - M
		
		int N;
		int M;
		int r;
		int c;
		int d;
		int count = 0;
		int result = 0;
		
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		int[][] arr = new int[N][M];
		
		r = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		while(true) {
			arr[r][c] = 2;
			
			if(d == 0 && arr[r][c - 1] == 0) {
				c = c - 1;
				d = 3;
				count = 0;
				continue;
			}
			else if(d == 0 && arr[r][c - 1] != 0) {
				if(count == 4 && arr[r + 1][c] != 1) {
					r = r + 1;
					count = 0;
					continue;
				}
				else if(count == 4 && arr[r + 1][c] == 1) {
					break;
				}
				else {
					d = 3;
					count++;
					continue;
				}
			}
			
			if(d == 1 && arr[r - 1][c] == 0) {
				r = r - 1;
				d = 0;
				count = 0;
				continue;
			}
			else if(d == 1 && arr[r - 1][c] != 0) {
				if(count == 4 && arr[r][c - 1] != 1) {
					c = c - 1;
					count = 0;
					continue;
				}
				else if(count == 4 && arr[r][c - 1] == 1) {
					break;
				}
				else {
					d = 0;
					count++;
					continue;
				}
			}
			
			if(d == 2 && arr[r][c + 1] == 0) {
				c = c + 1;
				d = 1;
				count = 0;
				continue;
			}
			else if(d == 2 && arr[r][c + 1] != 0) {
				if(count == 4 && arr[r - 1][c] != 1) {
					r = r - 1;
					count = 0;
					continue;
				}
				else if(count == 4 && arr[r - 1][c] == 1) {
					break;
				}
				else {
					d = 1;
					count++;
					continue;
				}
			}
			
			if(d == 3 && arr[r + 1][c] == 0) {
				r = r + 1;
				d = 2;
				count = 0;
				continue;
			}
			else if(d == 3 && arr[r + 1][c] != 0) {
				if(count == 4 && arr[r][c + 1] != 1) {
					c = c + 1;
					count = 0;
					continue;
				}
				else if(count == 4 && arr[r][c + 1] == 1) {
					break;
				}
				else {
					d = 2;
					count++;
					continue;
				}
			}
								
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
//				System.out.print(arr[i][j]);
				if(arr[i][j] == 2) {
					result++;
				}
			}
//			System.out.println();
		}
		
		System.out.println(result);
//		System.out.println(r);
//		System.out.println(c);
	}
}

/*
for (int i = 0; i < N; i++) {
	for (int j = 0; j < M; j++) {
		if (i == 0 || i == N - 1 || j == 0 || j == M - 1) {
			arr[i][j] = 1;
		}
		else if(i == r && j == c) {
			arr[i][j] = 9;
		}
		else {
			arr[i][j] = 0;
		}
	}
}

for (int i = 0; i < N; i++) {
	for (int j = 0; j < M; j++) {
		System.out.print(arr[i][j]);
	}
	System.out.println();
}
*/
