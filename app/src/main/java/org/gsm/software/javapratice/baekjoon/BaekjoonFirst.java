package org.gsm.software.javapratice.baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

// 5의수난 문제
public class BaekjoonFirst {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp1;
        int temp2 = 0;
        int result = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (num > 0){
            list.add(num%10);
            num = num/10;
        }
        result = list.get(0);
            
        for (int i = 0 ; i<5;i++){
            temp1 = list.get(i);
            for (int j = 0; j < 4; j++) {
                temp1 = temp1*list.get(i);
                temp2 = temp1;
            }
            result = result + temp2;
        }
        result = result - list.get(0);
        System.out.print(result);
    }
}
