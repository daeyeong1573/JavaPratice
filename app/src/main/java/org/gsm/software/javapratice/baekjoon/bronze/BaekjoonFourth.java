package org.gsm.software.javapratice.baekjoon.bronze;

import java.util.Arrays;
import java.util.Scanner;

//백준 최소,최대 10818번
public class BaekjoonFourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] temp = new int[t];
        int n;
        for(int i = 0 ; i<t;i++){
            temp[i] = sc.nextInt();
        }
        Arrays.sort(temp);
        System.out.print(temp[0]+" "+temp[t-1]);
    }
}
