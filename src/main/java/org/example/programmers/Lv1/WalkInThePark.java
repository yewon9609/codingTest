package org.example.programmers.Lv1;

public class WalkInThePark {
  public int[] solution(String[] park, String[] routes) {
    int startX = 0, startY = 0;
    char[][] parkArea = new char[park.length][park[0].length()];

    for (int i = 0; i < park.length; i++) {
      for (int j = 0; j < park[i].length(); j++) {
        parkArea[i][j] = park[i].charAt(j);
        if(park[i].charAt(j) == 'S') {
          startX = j;
          startY = i;
        }
      }
    }

    String[] direction = new String[routes.length];
    int[] distance = new int[routes.length];

    for (int i = 0; i < routes.length; i++) {
      direction[i] = routes[i].split(" ")[0];
      distance[i]  = Integer.parseInt(routes[i].split(" ")[1]);
    }

    char now = 0;
    int nowX = startX;
    int nowY = startY;

    for (int i = 0; i < routes.length; i++) {
      for (int j = 0; j <= distance[i]; j++) {
        switch (direction[i]) {
          case "E" :
            if(startX + distance[i] >= park[0].length()) {
              break;
            }
            nowX = startX + j;
            now = parkArea[startY][nowX];
            break;
          case "W" :
            if(startX-distance[i] < 0) {
              break;
            }
            nowX = startX-j;
            now = parkArea[startY][nowX];
            break;
          case "S":
            if(startY + distance[i] >= park.length) {
              break;
            }
            nowY = startY+j;
            now = parkArea[nowY][startX];
            break;
          case "N":
            if(startY - distance[i] < 0) {
              break;
            }
            nowY = startY - j;
            now = parkArea[nowY][startX];
            break;
        }

        if(now == 'X' || now == 0) {
          nowX = startX;
          nowY = startY;
          break;
        }
      }
      if(now != 'X' && now != 0) {
        startX = nowX;
        startY = nowY;
      }
    }
    return new int[]{startY, startX};
  }

}
