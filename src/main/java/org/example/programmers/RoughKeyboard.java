package org.example.programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RoughKeyboard {
  public int[] solution(String[] keymap, String[] targets) {
    int[] answer = new int[targets.length];
    Map<Character, Integer> alpha = new HashMap<>();

    for (int i = 0; i < keymap.length; i++) {
      String keyword = keymap[i];
      for (int j = 0; j < keymap[i].length(); j++) {
        if(!alpha.containsKey(keyword.charAt(j))) {
         alpha.put(keyword.charAt(j), j+1);
        }
        if(alpha.containsKey(keyword.charAt(j))
          && Integer.compare(alpha.get(keyword.charAt(j)), j) == 1 ) {
              alpha.put(keyword.charAt(j), j+1);
        }
      }
    }

    for (int i = 0; i < targets.length; i++) {
      int total = 0;
      boolean fail = false;
      String targetString = targets[i];

      for (int j = 0; j < targetString.length(); j++) {
        int findNum = alpha.getOrDefault(targetString.charAt(j), -1);

        if (findNum == -1) {
          fail = true;
          break;
        }

        total += findNum;
      }

      if (fail) {
        answer[i] = -1;
      } else {
        answer[i] = total;
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    RoughKeyboard roughKeyboard = new RoughKeyboard();
    String[] keymap = {"AGB", "BSSS"};
    String[] targets = {"AGZ", "BSSS"};
    int[] solution = roughKeyboard.solution(keymap, targets);

    System.out.println(Arrays.toString(solution));
  }
}
