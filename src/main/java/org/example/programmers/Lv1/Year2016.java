package org.example.programmers.Lv1;

import java.time.LocalDate;

public class Year2016 {
  public String solution(int a, int b) {
    LocalDate date = LocalDate.of(2016, a, b);
    return date.getDayOfWeek()
        .toString()
        .substring(0,3);
  }
}
