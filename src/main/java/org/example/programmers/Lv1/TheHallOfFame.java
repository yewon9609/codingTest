package org.example.programmers.Lv1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TheHallOfFame {

  public int[] solution(int k, int[] score) {
    int[] answer = new int[score.length];
    List<Integer> temp = new ArrayList<>();

    for (int i = 0; i < score.length; i++) {
      temp.add(score[i]);
      temp.sort(Comparator.reverseOrder());
      if (temp.size() > k) {
        temp.subList(k, temp.size()).clear();
      }

      answer[i] = temp.get(temp.size() - 1);
    }

    return answer;
  }

}
