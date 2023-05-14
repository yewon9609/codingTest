package org.example.programmers.Lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStringAsIWant {
  public List<String> solution(String[] strings, int n) {
    List<String> words = new ArrayList<>();

    for (String word : strings) {
      String[] splitWords = word.split("");
      for (int i = 0; i < splitWords.length; i++) {
        if (i == n) {
          words.add(splitWords[i] + word);
        }
      }
    }
    Collections.sort(words);

    for (int i = 0; i < words.size(); i++) {
      words.set(i, words.get(i).substring(1));
    }
    return words;
  }
}
