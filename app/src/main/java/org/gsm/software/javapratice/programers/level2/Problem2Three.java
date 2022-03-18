package org.gsm.software.javapratice.programers.level2;

import java.util.Arrays;

//프로그래머스 Level 2 최댓값 최솟값
public class Problem2Three {
    public static void main(String[] args) {
        System.out.print("1 -2 3 4");
    }
    public static String solution(String s) {
        String answer = "";
        String[] temp = s.split(" ");
        int[] change = Arrays.stream(temp).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(change);

        return change[0]+" "+change[change.length-1];
    }
}
