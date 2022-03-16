package org.gsm.software.javapratice.baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//백준 로마숫자 2608번
public class BaekjoonEleven {
    static String str = "";
    static int sum = 0;
    static Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] first = bf.readLine().split("");
        String[] second = bf.readLine().split("");

        map.put ("I", 1);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("L", 50);
        map.put("XL", 40);
        map.put("C", 100);
        map.put("XC", 90);
        map.put("D", 500);
        map.put("CD", 400);
        map.put("CM", 900);
        map.put("M", 1000);

        num(first);
        num(second);
        string(sum);
        System.out.println(sum);
        System.out.println(str);

    }

    public static void string(int sum){
        List<Map.Entry<String,Integer>> entry = new ArrayList<>(map.entrySet());
        entry.sort(Map.Entry.comparingByValue(Collections.reverseOrder()));
        while (sum != 0){
            int quo = 0;
            for (Map.Entry<String,Integer> val : entry){
                quo = sum/ val.getValue();
                if (quo != 0){
                    for (int i = 0 ; i < quo;i++){
                        str += val.getKey();
                    }
                    sum = sum%val.getValue();
                    break;
                }
            }
        }
    }

    public static void num(String[] n){
        for (int i = 0 ; i < n.length;i++){
            char c = n[i].charAt(0);
            if (( c == 'I' ||c=='X'||c=='C')&& i < n.length-1){
                String s = n[i] + n[i+1];
                if (map.containsKey(s)){
                    sum += map.get(s);
                    i++;
                    continue;
                }
            }
            sum += map.get(n[i]);
        }
    }

}
