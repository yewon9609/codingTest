package org.example.programmers.Lv2;

import java.util.Arrays;
import java.util.Stack;

public class ProceedingAssignment {

  private static class Work {

    String name;
    int workingTime;

    public Work(String name, int workingTime) {
      this.name = name;
      this.workingTime = workingTime;
    }

  }

  public String[] solution(String[][] plans) {
    int size = plans.length;
    String[] answer = new String[size];
    Arrays.sort(plans, (o1, o2) -> {
      return o1[1].compareTo(o2[1]);
    });
    Stack<Work> stack = new Stack<>();
    int prevTime = 0;
    int answerIndex = 0;

    for (int i = 0; i < size; i++) {
      String[] plan = plans[i];
      String name = plan[0];
      int startTime = stringToMinute(plan[1]);
      int timeTaken = stringToMinute(plan[2]);

      while (!stack.empty()) {
        Work prevWork = stack.pop();
        int endTime = prevTime + prevWork.workingTime;
        if (endTime <= startTime) {
          answer[answerIndex++] = prevWork.name;
          prevTime += prevWork.workingTime;
        } else {
          stack.push(new Work(prevWork.name, prevWork.workingTime - (startTime - prevTime)));
          break;
        }
      }

      stack.push(new Work(name, timeTaken));
      prevTime = startTime;
    }
    while (!stack.empty()) {
      answer[answerIndex++] = stack.pop().name;
    }
    return answer;
  }

  private static int stringToMinute(String str) {
    String[] temp = str.split(":");

    if (temp.length == 2) {
      return Integer.parseInt(temp[0]) * 60 + Integer.parseInt(temp[1]);
    } else {
      return Integer.parseInt(str);
    }
  }



  public static void main(String[] args) {
    ProceedingAssignment p = new ProceedingAssignment();
    String[][] plans = {{"science", "12:40", "50"}, {"music", "12:20", "40"},
        {"history", "14:00", "30"}, {"computer", "12:30", "100"}};

    String[] solution = p.solution(plans);
    for (String s : solution) {
      System.out.println(s);
    }
  }
}
