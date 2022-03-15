package org.gsm.software.javapratice.baekjoon;

import java.util.*;

//백준 N번째 큰수 구하기
public class BaekjoonEight {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int t = sc.nextInt();
        int[] rs = new int[t];

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < 10; j++) {
                a[j] = sc.nextInt();
            }
            Arrays.sort(a);
            rs[i] = a[7];
        }

        for (int i : rs) {
            System.out.println(i);
        }

    }
}
