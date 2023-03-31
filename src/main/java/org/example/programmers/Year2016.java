package org.example.programmers;

import java.time.LocalDate;

public class Year2016 {
  public String solution(int a, int b) {
    LocalDate date = LocalDate.of(2016, a, b);
    return date.getDayOfWeek()
        .toString()
        .substring(0,3);
  }

  public static void main(String[] args) {
    Year2016 year2016 = new Year2016();
    int a = 5;
    int b = 24;
    String answer = year2016.solution(a, b);
    System.out.println(answer);
  }
}
