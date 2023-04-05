package org.example.programmers.Lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DiscreteArrayOfNumbers {
  public List<Integer> solution(int[] arr, int divisor) {
    List<Integer> answer = new ArrayList<>();

    for (int i = 0; i < arr.length; i++) {
      if(arr[i]%divisor==0) {
        answer.add(arr[i]);
      }
    }
    if(answer.isEmpty()) {
      return List.of(-1);
    }

    Collections.sort(answer);

    return answer;
  }
}
