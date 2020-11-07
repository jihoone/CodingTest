package baekjoon;

import java.util.Scanner;

public class BAEKJOON_1476 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int E, S, M;
		
		E = sc.nextInt();
		S = sc.nextInt();
		M = sc.nextInt();
		
		int e = 1;
		int s = 1;
		int m = 1;
		int count = 1;
		
		while(true) {
			if(e == E && s == S && m == M) {
				break;
			}
			
			if(e == 15) {
				e = 0;
			}
			if(s == 28) {
				s = 0;
			}
			if(m == 19) {
				m = 0;
			}
			
			e++;
			s++;
			m++;
			count++;
		}
		
		System.out.println(count);
	}

}