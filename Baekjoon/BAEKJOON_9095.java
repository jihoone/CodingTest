package baekjoon;

import java.util.Scanner;

public class BAEKJOON_9095 {
	
	static int[] dp = new int[11];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int[] arr = new int[T];
		
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		
		for (int i = 4; i < 11; i++) {
			dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1];
		}
		
		for(int i = 0; i < T; i++) {
			int n = sc.nextInt();
			
			arr[i] = dp[n];
		}
		
		for (int i = 0; i < T; i++) {
			System.out.println(arr[i]);
		}
	}
}