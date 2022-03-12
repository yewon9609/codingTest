package codingTest;

import java.util.ArrayList;

public class P3 {
	 public  static int solution(int[][] board, int[] moves) {
	        int answer = 0;
	        ArrayList<Integer> result= new ArrayList<>();
	        
	        for (int i = 0; i <moves.length; i++) {
	        	for (int j = 0; j < board.length; j++) {
	        		if(board[j][moves[i]-1]!=0) {
	        			result.add(board[j][moves[i]-1]);
	        			board[j][moves[i]-1]=0;
	        		
	        			
	        			if(result.size()>1) {
	        				int a=result.size();
	        				if(result.get(a-1)==result.get(a-2)) {
	        					result.remove(a-1);
	        					result.remove(a-2);
	        					answer+=2;
	        					break;
	        			
	        				}else {
	        					break;
	        				}
	        			}else {
	        				break;
	        			}
	        		}
	        			
				}
	        	}
	        return answer;
	        
	        

   
	    
	 }
	 
	 
	 
	 public static void main(String[] args) {
		int[][] board= {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int [] moves= {1,5,3,5,1,2,1,4};
		System.out.println(solution(board, moves));
		
	}
}
