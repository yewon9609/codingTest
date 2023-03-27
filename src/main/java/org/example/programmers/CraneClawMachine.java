package org.example.programmers;

import java.util.ArrayList;
import java.util.Objects;

public class CraneClawMachine {
  public int solution(int[][] board, int[] moves) {
    int answer = 0;
    ArrayList<Integer> result= new ArrayList<>();

    for (int i = 0; i <moves.length; i++) {
      for (int j = 0; j < board.length; j++) {
        if(board[j][moves[i]-1]!=0) {
          result.add(board[j][moves[i]-1]);
          board[j][moves[i]-1]=0;


          if(result.size()>1) {
            int a=result.size();
            if(Objects.equals(result.get(a - 1), result.get(a - 2))) {
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
}
