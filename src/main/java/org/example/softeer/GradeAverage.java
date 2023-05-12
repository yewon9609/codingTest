package org.example.softeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GradeAverage {

    public static void main(String args[]) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st;
      st = new StringTokenizer(br.readLine());
      int studentNumber = Integer.parseInt(st.nextToken());
      int section = Integer.parseInt(st.nextToken());

      int[] scores = new int[studentNumber];
      st = new StringTokenizer(br.readLine());

      for(int i =0; i<studentNumber; i++) {
        scores[i] = Integer.parseInt(st.nextToken());
      }

      StringBuilder sb = new StringBuilder();
      for(int i =0; i<section; i++) {
        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        float total = 0;
        for(int j =start; j<=end; j++) {
          total+=scores[j-1];
        }
        sb.append(String.format("%.2f", total/(end-start+1)));
        sb.append("\n");
      }
      System.out.println(sb);

    }

}
