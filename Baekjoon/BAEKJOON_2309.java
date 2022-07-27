package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class BAEKJOON_2309 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		boolean[] arr = new boolean[9];
		int[] arr1 = new int[9];
		int[] arr2 = new int[9];
		
		for(int i = 0; i < 9; i++) {
			arr1[i] = sc.nextInt();
		}
		
		int sum = 0;
		
		for(int i = 0; i < 9; i++) {
			arr[i] = true;
			for(int j = i + 1; j < 9; j++) {
				arr[j] = true;
			
				for(int k = 0; k < 9; k++) {
					if(arr[k] == false) {
						sum += arr1[k];
					}
				}
				
				if(sum == 100) {
					break;
				}
				arr[j] = false;
				sum = 0;			
			}
			if(sum == 100) {
				break;
			}
			arr[i] = false;
		}
		
		for(int i = 0; i < 9; i++) {
			if(arr[i] == true) {
				continue;
			}
			arr2[i] = arr1[i];
		}
		
		Arrays.sort(arr2);
		
		for(int i = 0; i < 9; i++) {
			if(arr2[i] == 0) {
				continue;
			}
			System.out.println(arr2[i]);
		}
	}
}
