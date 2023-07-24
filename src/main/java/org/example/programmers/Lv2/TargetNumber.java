package org.example.programmers.Lv2;

public class TargetNumber {
  static int count = 0;

  public int solution(int[] numbers, int target) {
    dfs(numbers, target, 0, 0);
    return count;
  }

  public void dfs(int[] numbers, int target, int depth, int sum) {
    if(depth == numbers.length) {
      if(target == sum) {
        count++;
      }
    }else  {
      dfs(numbers, target, depth+1, sum+numbers[depth]);
      dfs(numbers, target, depth+1, sum-numbers[depth]);
    }
  }

  public static void main(String[] args) {
    TargetNumber t = new TargetNumber();
    int[] numbers = {1, 1, 1, 1, 1};
    int target = 3;
    int answer = t.solution(numbers, target);
    System.out.println(answer);
  }
}
