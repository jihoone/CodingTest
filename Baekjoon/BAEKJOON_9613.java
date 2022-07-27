package baekjoon;

import java.util.Scanner;

public class BAEKJOON_9613 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		long[] result = new long[t];
		
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			
			for(int j = 0; j < n; j++) {
				arr[j] = sc.nextInt();
			}
			
			int i1 = 0;
			int j1 = 1;
			long sum = 0;

			while(true) {
				int gcd = GCD(arr[i1], arr[j1]);

				sum += gcd;
				
				if (j1 == n - 1 && i1 != n - 2) {
					i1++;
					j1 = i1 + 1;
					continue;
				}
				if ( j1 == n - 1 && i1 == n - 2) {
					break;
				}
				j1++;
			}
			
			result[i] = sum;
		}
		
		for (int i = 0; i < t; i++) {
			System.out.println(result[i]);
		}
	}

	static int GCD(int a, int b) {
		if (b == 0) {
			return a;
		}
		
		return GCD(b, a % b);
	}
}