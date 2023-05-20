//	쿠키의 신체 측정

package Level2;
import java.io.*;

public class Level2_44 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] point = new int[2];
		int[] len = {0, 0, 0, 0, 0};
		boolean bo = true;
		
		for(int i = 0; i < num; i++) {
			String str = br.readLine();
			String[] arr = str.split("");
			
			if(bo == true) {
				for(int j = 0; j < arr.length; j++) {
					String st = arr[j];
					
					if(st.equals("*")) {
						point[0] = i + 2;
						point[1] = j + 1;
						bo = false;
						break;
					}
				}
			}
			else {
				for(int j = 0; j < arr.length; j++) {
					String st = arr[j];
					
					if(st.equals("*")) {
						if(point[1] - 1 > j) len[0]++;
						else if(point[1] - 1 == j) continue;
						else len[1]++;
					}
				}
			}
			if(point[0] - 1 == i) break;
		}
		
		int cnt = point[0];
		
		while(cnt != num){
			String str = br.readLine();
			String[] arr = str.split("");
			
			if(arr[point[1] - 1].equals("*")) len[2]++;
			if(arr[point[1] - 2].equals("*")) len[3]++;
			if(arr[point[1]].equals("*")) len[4]++;
			
			cnt++;
		}
		
        System.out.println(point[0] + " " + point[1]);
		System.out.print(len[0] + " " + len[1] + " " + len[2] + " " + len[3] + " " + len[4]);
	}

}
