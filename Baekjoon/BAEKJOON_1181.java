package baekjoon;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

public class BAEKJOON_1181 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		sc.nextLine();

		String[] str = new String[N];

		for (int i = 0; i < N; i++) {
			str[i] = sc.nextLine();
		}

		Arrays.sort(str, new Comparator<String>() {
			public int compare(String s1, String s2) {
				if (s1.length() == s2.length()) {
					return s1.compareTo(s2);
				} 
				else {
					return s1.length() - s2.length();
				}
			}
		});

		System.out.println(str[0]);

		for (int i = 1; i < N; i++) {
			if (!str[i].equals(str[i - 1])) {
				System.out.println(str[i]);
			}
		}
	}
}