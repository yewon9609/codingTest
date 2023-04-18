package org.example.programmers.Lv2;

public class NormalSquare {
  public long solution(int w, int h) {
    int gcd = getGCD(w, h);
    return ((long) w *h)-((long) (w / gcd + h / gcd - 1) * gcd);
  }


  public static int getGCD(int num1, int num2) {
    if (num1 % num2 == 0) {
      return num2;
    }
    return getGCD(num2, num1%num2);
  }
}
