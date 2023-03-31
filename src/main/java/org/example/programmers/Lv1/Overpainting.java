package org.example.programmers.Lv1;

public class Overpainting {
  public int solution(int n, int m, int[] section) {
    int answer = 0;
    int paintedArea = section[0];

    for (int i = 0; i < section.length; i++) {
      if(section[i]<paintedArea) {
        continue;
      }
      answer ++;
      paintedArea = section[i] + m;
    }
    
    return answer;
  }
}
