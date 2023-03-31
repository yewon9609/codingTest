package org.example.programmers.Lv1;

import java.util.Stack;

public class MakeBurger {
  public int solution(int[] ingredient) {
    int answer = 0;

    Stack<Integer> stack = new Stack<>();
    for (int i : ingredient) {
      stack.push(i);
      if(stack.size() >= 4) {
        if(isCorrect(stack)) {
          answer ++;
          pop(stack);
        }
      }
    }
    return answer;
  }

  private boolean isCorrect(Stack<Integer> stack) {
    return stack.get(stack.size() - 4) == 1
        && stack.get(stack.size() - 3) == 2
        && stack.get(stack.size() - 2) == 3
        && stack.get(stack.size() - 1) == 1;
  }

  private void pop(Stack<Integer> stack) {
    stack.pop();
    stack.pop();
    stack.pop();
    stack.pop();
  }


  public static void main(String[] args) {
    MakeBurger makeBurger = new MakeBurger();
    int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
    int answer = makeBurger.solution(ingredient);
    System.out.println(answer);
  }
}
