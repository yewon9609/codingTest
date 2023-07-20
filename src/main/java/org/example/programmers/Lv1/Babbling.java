package org.example.programmers.Lv1;

public class Babbling {

  public int solution(String[] babbling) {
    int answer = 0;
    String aya = "aya", ye = "ye", woo = "woo", ma = "ma";

    for (int i = 0; i < babbling.length; i++) {

      if(babbling[i].contains(aya.concat(aya))
        || babbling[i].contains(ye.concat(ye))
        || babbling[i].contains(woo.concat(woo))
        || babbling[i].contains(ma.concat(ma))) {
        continue;
      }

      String replaceBabbling = babbling[i].replace(aya, "")
          .replace(ye, "")
          .replace(woo, "")
          .replace(ma, "");

      if (replaceBabbling.isEmpty()) {
        answer++;
      }

    }

    return answer;
  }

  public static void main(String[] args) {
    Babbling b = new Babbling();
    String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
    int solution = b.solution(babbling);
    System.out.println(solution);
  }
}
