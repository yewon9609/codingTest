package org.example.programmers.Lv2;

import java.util.Arrays;

public class TriangularSnail {

  public int[] solution(int n) {
    int[] answer = new int[n*(n+1)/2];
    int x = -1, y = 0;
    int num = 1;
    int[][] matrix = new int[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = i; j < n; j++) {
        if(i%3==0) {
          x++;
        } else if (i%3 ==1) {
          y++;
        }else if (i%3 ==2) {
          x--;
          y--;
        }
        matrix[x][y] = num++;
      }
    }


    int k = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if(matrix[i][j] == 0) {
          break;
        }
        answer[k++]  = matrix[i][j];
      }
    }


    return answer;
  }

  public static void main(String[] args) {
    TriangularSnail t = new TriangularSnail();
    int[] solution = t.solution(4);
    System.out.println(Arrays.toString(solution));
  }
}
