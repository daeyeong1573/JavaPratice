package org.gsm.software.javapratice.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.*;

//백준 이진수 3460번
class BaekJoonThree {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        System.out.print(t);

        for (int i = 0; i < t; i++) {
            String n = Integer.toBinaryString(Integer.parseInt(bf.readLine()));
            String[] binary = n.split("");
            List<String> reverse = Arrays.asList(binary);
            Collections.reverse(reverse);

            int cnt = 0;
            for (String tmp : reverse) {
                if (tmp.equals("1")) {
                    System.out.print(cnt + " ");
                }
                cnt++;
            }

        }
    }
}

