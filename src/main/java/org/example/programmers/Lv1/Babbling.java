package org.example.programmers.Lv1;

public class Babbling {

  public int solution(String[] babbling) {
    int answer = 0;
    String aya = "aya", ye = "ye", woo = "woo", ma = "ma";

    for (String babb : babbling) {

      if (babb.contains(aya + aya) || babb.contains(ye + ye) || babb.contains(woo + woo)
          || babb.contains(ma + ma)) {

        continue;
      }

        String replaceBabbling = babb.replace(aya, " ")
            .replace(ye, " ")
            .replace(woo, " ")
            .replace(ma, " ")
            .replace(" ", "");

      System.out.println(replaceBabbling + "dd");
      if (replaceBabbling.equals("")) {
        answer++;
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    Babbling b = new Babbling();
    String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa", "yayae"};
    int solution = b.solution(babbling);
    System.out.println(solution);
  }
}
