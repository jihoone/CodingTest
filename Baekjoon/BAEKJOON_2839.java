package BAEKJOON;

import java.util.Scanner;

public class BAEKJOON_2839 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N;
		
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		
		int count = 0;
		
		while(true) {
			if (N % 5 == 0) {
				System.out.println(N / 5 + count);
				break;
			}
			else if (N <= 0) {
				System.out.println(-1);
				break;
			}
			N -= 3;
			count++;
		}		
	}
}