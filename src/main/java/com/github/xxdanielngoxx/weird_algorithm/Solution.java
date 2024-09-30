package com.github.xxdanielngoxx.weird_algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Solution {
  public static void main(String[] args) throws IOException {
    final BufferedReader bufferedReader = new BufferedReader(
        new InputStreamReader(System.in)
    );

    int n;
    try (bufferedReader) {
      n = Integer.parseInt(
          bufferedReader.readLine()
      );
    }

    final String result = solution(n).stream()
        .map(Objects::toString)
        .collect(Collectors.joining(" "));

    System.out.println(result);
  }

  private static List<Long> solution(long n) {
    final List<Long> result = new LinkedList<>();

    result.add(n);
    while (n != 1) {
      if (n % 2 == 0) {
        n = n / 2;
      } else {
        n = (n * 3) + 1;
      }
      result.add(n);
    }

    return result;
  }
}
