package org.example.programmers.Lv1;

import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class DontLikeSameNumber {
  public List<Integer> solution(int []arr) {
    Stack<Integer> stack = new Stack<>();

    for (int i = 0; i < arr.length; i++) {
      if(stack.isEmpty() || stack.peek() != arr[i]) {
        stack.add(arr[i]);
      }
    }

    return stack.stream().collect(Collectors.toList());
  }
}
