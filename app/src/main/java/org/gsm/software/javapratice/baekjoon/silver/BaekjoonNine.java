package org.gsm.software.javapratice.baekjoon.silver;

import java.util.*;


//백준 쉽게 푸는 문제 1292번
public class BaekjoonNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0 ;
        int result = 0;

        Loop:
        for (int i = 1 ;i <= b; i++){
            for (int j = 0 ; j < i ;j++){
                cnt++;
                if (cnt >= a && cnt <= b){
                    result = result + i;
                }
            }
        }

        System.out.print(result);

    }
}
