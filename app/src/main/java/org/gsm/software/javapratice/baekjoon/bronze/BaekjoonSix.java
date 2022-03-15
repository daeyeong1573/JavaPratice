package org.gsm.software.javapratice.baekjoon.bronze;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//백준 저항 1076번
public class BaekjoonSix {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("black", 0);
        map.put("brown", 1);
        map.put("red", 2);
        map.put("orange", 3);
        map.put("yellow", 4);
        map.put("green", 5);
        map.put("blue", 6);
        map.put("violet", 7);
        map.put("grey", 8);
        map.put("white", 9);
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        String second = sc.next();
        String third = sc.next();

        // 첫번째 값과 두번째 값 입력
        Long result = new Long((map.get(first)*10)+map.get(second));

        //세번째 갑 곱하기
        for (int i = 0 ; i<map.get(third);i++){
            result = result*10;
        }

        System.out.print(result);

    }
}
