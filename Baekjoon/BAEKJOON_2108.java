package baekjoon;

import java.util.Scanner;

public class BAEKJOON_2108 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		int N;
		int ave, middle, frequ, range;

		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		int[] num = new int[N];
		
		for (int i = 0; i < N; i++) {
			num[i] = sc.nextInt();
		}
		
		int low = 0;
		int high = num.length - 1;
		
		ave = ave(num, N);
		middle = middle(num, low, high);
		frequ = Frequency(num, N);
		range = Range(num, N);
			
		System.out.println(ave);
		System.out.println(middle);
		System.out.println(frequ);
		System.out.println(range);
	}
	
	static int ave(int[] num, int N){
		int sum = 0;
		double ave, res;
		int n;
		
		for (int i = 0; i < N; i++) {
			sum += num[i];
		}
		
		ave = (double)sum / N;
		n = sum / N;
		res = ave - n;
		
		if(res < 0 && res <= -0.5) {
			return n - 1;
		}
		else if(res > 0 && res >= 0.5) {
			return n + 1;
		}
		else {
			return n;
		}
	}

	static void sort(int[] num, int low, int high) {
		if(low >= high) {
			return;
		}
		
		int mid = partition(num, low, high);
		
		sort(num, low, mid - 1);
		sort(num, mid, high);
	}
	
	static int partition(int[] num, int low, int high) {
		int pivot = num[(low + high) / 2];
		
		while(low <= high) {
			while(num[low] < pivot) {
				low++;
			}
			while(num[high] > pivot) {
				high--;
			}
			
			if(low <= high) {
				swap(num, low, high);
				low++;
				high--;
			}
		}
		
		return low;
	}
	
	static void swap(int[] num, int low, int high) {
		int tmp = num[low];
		num[low] = num[high];
		num[high] = tmp;
	}
	
	static int middle(int[] num, int low, int high) {
		sort(num, low, high);
		
		return num[(low + high) / 2];
	}
	
	static int Frequency(int[] num, int N) {
		int count = 0;
		int result;
		int[] fre = new int[N];
		
		for(int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(num[i] == num[j]) {
					count++;
				}
			}
			fre[i] = count;
			count = 0;
		}
		
		int best = fre[0];
		int[] res = new int[N];
		int t = 0;
		
		for(int i = 1; i < N; i++) {
			if(best < fre[i]) {
				best = fre[i];
			}
		}
		
		for(int i = 0; i < N; i++) {
			if (fre[i] == best) {
				res[t] = num[i];
				t++;
			}
		}
		
		sort(res, 0, res.length - 1);
		result = res[0];
		
		for (int i = 1; i < res.length; i++) {
			if(result < res[i]) {
				return res[i];
			}
		}
		return result;
	}
	
	static int Range(int[] num, int N) {
		int high = num[N - 1];
		int low = num[0];
		return high - low;
	}
}