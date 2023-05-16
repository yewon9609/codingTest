package org.example.programmers.Lv1;

public class HarshadNumber {

  public boolean solution(int x) {
    boolean answer = true;
    String[] inputValue = String.valueOf(x).split("");
    int total = 0;

    for (String inputChar : inputValue) {
      total+=Integer.parseInt(inputChar);
    }

    if(x%total == 0) {
      return true;
    }

    return false;
  }

  public static void main(String[] args) {
    HarshadNumber h = new HarshadNumber();
    int x = 18;
    boolean solution = h.solution(x);
    System.out.println(solution);
  }
}
