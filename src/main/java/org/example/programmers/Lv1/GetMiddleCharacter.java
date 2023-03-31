package org.example.programmers.Lv1;

public class GetMiddleCharacter {
  public String solution(String s) {
    int evenIdx1 = s.length()/2-1;
    int evenIdx2 = s.length()/2;

    if (s.length()%2 == 0) {
      return s.charAt(evenIdx1) + "" + s.charAt(evenIdx2);
    }

    return s.charAt(s.length()/2) + "";
  }
}
