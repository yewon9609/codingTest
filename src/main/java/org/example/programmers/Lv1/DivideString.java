package org.example.programmers.Lv1;

public class DivideString {
  public int solution(String s) {
    int answer = 0, count = 0, diff =0;
    char firstChar = s.charAt(0);

    for (int i = 0; i < s.length(); i++) {

      if(count==diff) {
        answer ++;
        firstChar = s.charAt(i);
      }

      if(firstChar == s.charAt(i)) {
        count++;
      }else {
        diff++;
      }

    }

    return answer;
  }

  public static void main(String[] args) {
    DivideString d = new DivideString();
    String s = "abracadabra";
    int answer = d.solution(s);
    System.out.println(answer);
  }
}
