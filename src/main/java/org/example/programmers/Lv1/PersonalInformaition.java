package org.example.programmers.Lv1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonalInformaition {
  public List<Integer> solution(String today, String[] terms, String[] privacies) {
    List<Integer> answer = new ArrayList<>();
    Map<String, Integer> termMap = new HashMap<>();
    String[] todaySplit = today.split("\\.");
    int todayYear = Integer.parseInt(todaySplit[0]);
    int todayMonth = Integer.parseInt(todaySplit[1]);
    int todayDays = Integer.parseInt(todaySplit[2]);


    for (String term : terms) {
      String[] s = term.split(" ");
      termMap.put(s[0], Integer.valueOf(s[1]));
    }

    for (int i = 0; i < privacies.length; i++) {
      String[] collectionDate = privacies[i].split(" ");
      int validity = termMap.get(collectionDate[1]);

      String[] date = collectionDate[0].split("\\.");
      int year = Integer.valueOf(date[0]);
      int month = Integer.valueOf(date[1]);
      int days = Integer.valueOf(date[2]);

      LocalDate periodDate = LocalDate.of(year, month, days);
      periodDate = periodDate.plusMonths(validity).minusDays(1L);
      LocalDate todayDate = LocalDate.of(todayYear, todayMonth, todayDays);

      if(todayDate.isAfter(periodDate)) {
        answer.add(i+1);
      }

    }
    return answer;
  }
}
