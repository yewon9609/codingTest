package org.example.programmers.Lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BunchOfCards {
  public String solution(String[] cards1, String[] cards2, String[] goal) {
    List<String> cards1_list = new ArrayList<>(Arrays.asList(cards1));
    List<String> cards2_list = new ArrayList<>(Arrays.asList(cards2));
    List<String> goal_list = new ArrayList<>(Arrays.asList(goal));

      for (String word : goal) {
        if(!cards1_list.isEmpty()) {
          if(cards1_list.get(0).equals(word)) {
            goal_list.remove(0);
            cards1_list.remove(0);
          }
        }

        if(!cards2_list.isEmpty()) {
          if(cards2_list.get(0).equals(word)) {
            goal_list.remove(0);
            cards2_list.remove(0);
          }
        }
      }

    if(goal_list.size() == 0 ) {
      return "Yes";
    }

    return "No";
  }
}
