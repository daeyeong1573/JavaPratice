package org.gsm.software.javapratice.baekjoon.gold;

import java.util.*;

public class BeakjoonTwelve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        String[] operator = new String[n-1];


        for (int i = 0; i < n ;i++){
            num[i] = sc.nextInt();
        }

        int j = 0 ;
        int cnt = 0;

        //연산자 입력
        while (j > n-1){
            int oper = sc.nextInt();
            for (int i = 0 ; i < oper ; i++){
                switch (j){
                    case 0 : operator[cnt++] = "+"; break;
                    case 1 : operator[cnt++] = "-"; break;
                    case 2 : operator[cnt++] = "*"; break;
                    case 3 : operator[cnt++] = "/"; break;
                }
            }
            j += oper;
        }



    }
}
