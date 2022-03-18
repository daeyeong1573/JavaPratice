package org.gsm.software.javapratice.programers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//프로그래머스 Level 2 최솟값 구하기
public class Problem2Two {
    public static void main(String[] args) {
        int[] a = {1,4,2};
        int[] b = {5,4,4    };
        System.out.print(solution(a, b));
    }

    public static int solution(int[] a, int[] b) {
        int answer = 0;
        List<Integer> al = new ArrayList<>();
        List<Integer> bl = new ArrayList<>();
        int length = a.length;

        for (int i = 0; i < length; i++) {
            al.add(a[i]);
            bl.add(b[i]);
        }
        Collections.sort(al);
        Collections.sort(bl,Collections.reverseOrder());

        System.out.println(al+"\n"+bl);

        for (int i =0; i < length ; i++){
            answer += al.get(i)*bl.get(i);
        }


        return answer;
    }


}

