package org.gsm.software.javapratice.baekjoon.bronze;

import java.io.*;

//백준 나누기 1075번
public class BaekjoonFifth {
    public static void main(String[] args) throws IOException {
        //입력
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int f = Integer.parseInt(bf.readLine());
        // 맨 뒤 2자리를 없애줌
        int temp = (n / 100) * 100;
        while (true) {
            // 나누어 떨어질때까지 temp의 값을 늘려가면서 비교
            if (temp % f == 0) {
                int result = temp % 100;
                if (result < 10) System.out.println("0" + result);
                else System.out.println(result);
                return;
            }
            temp++;
        }

    }
}
