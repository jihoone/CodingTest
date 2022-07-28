//	키패드 누르기

package coodingTest;

public class Level1_5 {
	class Solution {
	    public String solution(int[] numbers, String hand) {
	        String answer = "";
	        String[] arr = new String[numbers.length];
	        int leftp = 10;
	        int rightp = 12;
	        
	        for (int i = 0; i < numbers.length; i++){
	            int num =  numbers[i];
	            if (num == 0) num = 11;
	            
	            if (num % 3 == 0){
	                arr[i] = "R";
	                rightp = num;
	            }
	            else if (num % 3 == 1){
	                arr[i] = "L";
	                leftp = num;
	            }
	            else{
	                int minL = (num > leftp) ? num - leftp : leftp - num;
	                int minR = (num > rightp) ? num - rightp : rightp - num;
	                int disL = (minL / 3) + (minL % 3);
	                int disR = (minR / 3) + (minR % 3);
	                
	                if (disL > disR){
	                    arr[i] = "R";
	                    rightp = num;
	                }
	                else if (disL < disR){
	                    arr[i] = "L";
	                    leftp = num;
	                }
	                else{
	                    if (hand.equals("right")){
	                        arr[i] = "R";
	                        rightp = num;
	                    }
	                    else{
	                        arr[i] = "L";
	                        leftp = num;
	                    }
	                }
	            }
	        }
	        answer = String.join("", arr);
	        
	        return answer;
	    }
	}
}
