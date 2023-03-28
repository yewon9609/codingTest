package org.example.programmers;

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

  public static void main(String[] args) {
    Overpainting overpainting = new Overpainting();
    //구역
    int n = 8;
    //롤러 길이
    int m = 4;
    //덧칠해야 하는 부분
    int[] section = {2,3,6};
    System.out.println(overpainting.solution(n, m, section));
  }

}
