package org.example.programmers.Lv1;

public class CodeBetweenTwoPeople {

  public String solution(String s, String skip, int index) {
    String answer = "";

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      int count = 1;
      while (count <= index) {
        c++;
        if(c>122) {
          c = (char) (c-26);
        }
        if(skip.contains(c+"")) {
          continue;
        }
        count++;
      }
      answer += c;
    }
    return answer;
  }
}
