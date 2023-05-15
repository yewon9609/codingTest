package org.example.programmers.Lv1;

public class NumberOfPAndY {

  boolean solution(String s) {
    String[] inputChar = s.toLowerCase().split("");
    int pCnt = 0, yCnt = 0;

    for (int i = 0; i < inputChar.length; i++) {
      if (inputChar[i].equals("p")) {
        pCnt++;
      }
      if (inputChar[i].equals("y")) {
        yCnt++;
      }
    }

    if (pCnt == yCnt) {
      return true;
    }

    return false;
  }

}
