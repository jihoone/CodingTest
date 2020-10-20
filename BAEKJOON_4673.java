package BAEKJOON;

public class BAEKJOON_4673 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[10000];
		boolean[] fixArr = new boolean[10000];
		
		for(int i = 1; i < 10001; i++) {
			arr[i - 1] = i;
			int a = Cal(arr[i - 1]);
			if(a == 0) {
				;
			}
			else {
				fixArr[a - 1] = true;
			}
		}
		
		for (int i = 0; i < 10000; i++) {
			if(fixArr[i] == false) {
				Print(arr[i]);
			}
		}
		
	}
	
	static int Cal(int arr) {
		int first = arr / 10000;
		int second = (arr - first * 10000) / 1000 ;
		int third = (arr - first * 10000 - second * 1000) / 100;
		int four = (arr - first * 10000 - second * 1000 - third * 100) / 10;
		int five = (arr - first * 10000 - second * 1000 - third * 100) % 10;
		int result = arr + first + second + third + four + five;
		
		if (result > 0 && result <= 10000) {
			return result;
		}
		else {
			return 0;
		}
	}
	
	static void Print(int arr) {
		System.out.println(arr);
	}
	
	static void Print(boolean arr) {
		System.out.println(arr);
	}
}
