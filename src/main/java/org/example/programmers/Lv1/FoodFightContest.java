package org.example.programmers.Lv1;

public class FoodFightContest {

  public String solution(int[] food) {
    StringBuffer answer = new StringBuffer();

    for (int i = 1; i < food.length; i++) {
      if (food[i] % 2 == 0) {
        for (int j = 0; j < food[i] / 2; j++) {
          answer.append(i);
        }
      } else if (food[i] > 2) {
        for (int j = 0; j < food[i] / 2; j++) {
          answer.append(i);
        }
      }
    }

    String reverse = answer.reverse().toString();
    answer.reverse();
    answer.append(0);
    answer.append(reverse);

    return answer.toString();
  }

}
