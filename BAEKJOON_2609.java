package baekjoon;

import java.util.Scanner;

public class BAEKJOON_2609 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int gcd = gcd(a, b);
		int lcm = a * b / gcd;

		System.out.println(gcd);
		System.out.println(lcm);
	}
	
	static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		
		return gcd(b, a % b);
	}
}