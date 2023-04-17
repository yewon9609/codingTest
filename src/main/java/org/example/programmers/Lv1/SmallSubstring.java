package org.example.programmers.Lv1;

public class SmallSubstring {

  public int solution(String t, String p) {
    int answer = 0;

    for (int i = 0; i <= t.length() - p.length(); i++) {
      String possibleCombi = t.substring(i, p.length() + i);
      if (Long.parseLong(p) >= Long.parseLong(possibleCombi)) {
        answer++;
      }
    }

    return answer;
  }

}
