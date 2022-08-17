//	정수 제곱근 판별

package coodingTest;

public class Level1_45 {
	class Solution {
	    public long solution(long n) {
			long test = 0;
			long cnt = 1;
			long real;
			long answer;

			while (true) {
				test = cnt * cnt;
				if (test == n) {
					real = cnt;
					break;
				}
				cnt++;
				if (cnt > 7100000) {
					return -1;
				}
			}

			answer = (real + 1) * (real + 1);
			return answer;
	    }
	}
}
