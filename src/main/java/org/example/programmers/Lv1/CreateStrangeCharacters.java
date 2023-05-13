package org.example.programmers.Lv1;

public class CreateStrangeCharacters {

  public String solution(String s) {
    String answer = "";
    int idx = 0;
    String[] chars = s.split("");

    for(String character : chars) {
      idx = character.contains(" ") ? 0 : idx + 1;
      answer += idx%2 == 0 ? character.toLowerCase() : character.toUpperCase();
    }

    return answer;
  }
}
