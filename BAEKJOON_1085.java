package baekjoon;

import java.util.Scanner;

public class BAEKJOON_1085 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int minX = x;
		int minY = y;
		
		int min1, min2, result;
		
		min1 = Math.min(minX, w - x);
		min2 = Math.min(minY, h - y);
		result = Math.min(min1, min2);
		
		System.out.println(result);
	}
}