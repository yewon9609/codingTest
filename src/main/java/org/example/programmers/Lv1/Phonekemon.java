package org.example.programmers.Lv1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Phonekemon {
  public int solution(int[] nums) {
    int denominator = 2;
    int expectResult = nums.length / denominator;
    Set<Integer> distinctNums = new HashSet<>(Arrays.stream(nums).boxed().collect(Collectors.toList()));

    if(distinctNums.size() < expectResult) {
      return distinctNums.size();
    }

    return expectResult;
  }

  public static void main(String[] args) {
    Phonekemon phonekemon = new Phonekemon();
    int[] nums = {3,3,3,2,2,2};
    int answer = phonekemon.solution(nums);
    System.out.println(answer);
  }
}
