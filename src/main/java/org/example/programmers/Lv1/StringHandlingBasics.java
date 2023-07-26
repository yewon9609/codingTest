package org.example.programmers.Lv1;

import java.util.regex.Pattern;

public class StringHandlingBasics {

  public boolean solution(String s) {
    boolean answer = false;
    String reg = "^[0-9]*$";
    if (s.length() == 4 || s.length() == 6) {
      answer = Pattern.matches(reg, s);
    }

    return answer;
  }
}
