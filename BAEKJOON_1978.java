package baekjoon;

import java.util.Scanner;

public class BAEKJOON_1978 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		boolean res = true;
		int count = 0;
	
		for(int i = 0; i < N; i++) {
			int num = sc.nextInt();
			
			if(num <= 1) {
				res = false;
			}
			else {
				for(int j = 2; j <= num / 2; j++) {
					if(num % j == 0) {
						res = false;
					}
					else {
						;
					}
				}
			}
			
			if(res) {
				count++;
			}
			res = true;
		}
		
		System.out.println(count);
	}
}