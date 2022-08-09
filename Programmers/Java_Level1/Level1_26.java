//	가운데 글자 가져오기

package coodingTest;

public class Level1_26 {
	class Solution {
		public String solution(String s) {
			String answer = "";
			String[] arr = s.split("");
			String[] arrA = new String[2];
			int count = 0;

			if (arr.length % 2 == 0) {
				for (int i = 0; i < arr.length; i++) {
					if (arr.length / 2 - 1 == i || arr.length / 2 == i) {
						arrA[count] = arr[i];
						count++;
					}
				}
				answer = String.join("", arrA);
			} else {
				for (int i = 0; i < arr.length; i++) {
					if (arr.length / 2 == i) {
						answer = arr[i];
					}
				}
			}

			return answer;
		}
	}
}
