package org.example.programmers.Lv1;

import java.util.Arrays;

public class SortByStringDescendingOrder {

  public String solution(String s) {
    char[] chars = s.toCharArray();
    Arrays.sort(chars);
    String str = new String(chars);
    return new StringBuilder(str).reverse().toString();
  }

}
