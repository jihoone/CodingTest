package baekjoon;

import java.util.Scanner;

public class BAEKJOON_1934 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Scanner sc = new Scanner(System.in);
			int T = sc.nextInt();
			int[] lcm = new int[T];
			
			for (int i = 0; i < T; i++) {
				int A = sc.nextInt();
				int B = sc.nextInt();
				
				int gcd = gcd(A, B);
				lcm[i] = A * B / gcd;
			}
			
			for (int i = 0; i < T; i++) {
				System.out.println(lcm[i]);
			}
		}
		
		static int gcd(int a, int b) {
			if (b == 0) {
				return a;
			}
			
			return gcd(b, a % b);
	}
}