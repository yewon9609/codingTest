package org.example.programmers.Lv1;

import java.util.ArrayList;
import java.util.List;

public class KnightWeapon {

  public int solution(int number, int limit, int power) {
    int answer = 0;

    List<Integer> arr = new ArrayList<>();
    for (int i = 1; i <=
        number; i++) {
      int cnt = 0;
      cnt = getCnt(i, cnt);
      arr.add(cnt);
    }

    for (int i = 0; i < arr.size(); i++) {
      if (arr.get(i) > limit) {
        answer += power;
      } else {
        answer += arr.get(i);
      }
    }

    return answer;
  }

  private static int getCnt(int number, int cnt) {
    for (int i = 1; i * i <= number; i++) {
      if (i * i == number) {
        cnt++;
      } else if (number % i == 0) {
        cnt += 2;
      }
    }
    return cnt;
  }

}
