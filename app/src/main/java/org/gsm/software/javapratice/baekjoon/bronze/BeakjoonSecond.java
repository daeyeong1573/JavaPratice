package org.gsm.software.javapratice.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//백준 n번째 약수 구하기
public class BeakjoonSecond {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int cnt = 0;
        int i = 1;

        if (a >= 1 && a <= 10000 && b >= 1 && b < a) {

            while (true) {
                if (a % i == 0) {
                    cnt++;
                    if (cnt == b) {
                        cnt = i;
                        break;
                    }
                }
                if (i > a) {
                    cnt = 0;
                    break;
                }
                i++;
            }
        }
        System.out.print(cnt);

    }
}
