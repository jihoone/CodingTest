package baekjoon;

//import java.util.Arrays;
import java.util.Scanner;

public class BAEKJOON_10819 {
	
	static int max = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] num = new int[N];
		
		for (int i = 0; i < N; i++) {
			num[i] = sc.nextInt();
		}
		
		perm(num, 0, N);
		
		System.out.println(max);
	}
	
	static void perm(int[] a, int depth, int n) {
		if(depth == n) {
			sum(a, n);
			return;
		}
		
		for (int i = depth; i < n; i++) {
			swap(a, i, depth);
			perm(a, depth + 1, n);
			swap(a, i, depth);
		}
	}
	
	static void swap(int[] a, int depth, int n) {
		int temp = a[depth];
		a[depth] = a[n];
		a[n] = temp;
	}
	
	static void sum(int[] a, int k) {
		int sum = 0;
		
		for (int i = 2; i <= k; i++) {
			sum += Math.abs(a[i - 2] - a[i - 1]);
		}
		
		if(max < sum) {
			max = sum;
		}
	}
}

/*		
Scanner sc = new Scanner(System.in);

int N = sc.nextInt();
int[] arr = new int[N];

for (int i = 0; i < N; i++) {
	arr[i] = sc.nextInt();
}

Arrays.sort(arr);

for (int i = 0; i < N; i++) {
	System.out.print(arr[i] + " ");
}
System.out.println();


int[] arrResult = new int[N];
int sum = 0;
int j = 0;
int k = 1;

for(int i = 0; i < N / 2; i++) {
	arrResult[j] = arr[N / 2 - i - 1];
	j += 2;
}
for(int i = 0; i < N / 2; i++) {
	arrResult[k] = arr[N - i - 1];
	k += 2;
}
if(N % 2 != 0) {
	arrResult[N - 1] = arr[N / 2];
}

for (int i = 0; i < N; i++) {
	System.out.print(arrResult[i] + " ");
}

for(int i = 0; i < N - 1; i++) {
	sum += abs(arrResult[i + 1] - arrResult[i]);
}

System.out.println();
System.out.println(sum);
}

static int abs(int n) {
if(n < 0) {
	n = 0 - n;
}

return n;
}
*/