package org.example.programmers.Lv1;

public class ClosestLetter {

  public int[] solution(String s) {
    int[] answer = new int[s.length()];

    for (int i = 0; i < s.length(); i++) {
      String temp = s.substring(0, i);
      int idx = temp.lastIndexOf(s.charAt(i));

      if (idx != -1) {
        answer[i] = i - idx;
      } else {
        answer[i] = idx;
      }
    }

    return answer;
  }
}
