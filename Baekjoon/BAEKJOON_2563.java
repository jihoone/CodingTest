package baekjoon;

import java.util.Scanner;

public class BAEKJOON_2563 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		boolean arr[][] = new boolean[100][100];
		
		for (int i = 0; i < num; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			for (int j = y; j < y + 10; j++) {
				for (int k = x; k < x + 10; k++) {
					arr[k][j] = true;
				}
			}
		}
		
		int count = 0;
		
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if(arr[i][j] == true) {
					count++;
				}
			}
		}
		
		System.out.println(count);
	}
}