package org.gsm.software.javapratice.programers.hash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

//프로그래머스 Hash 3번째 위장
public class ProgramersThird {
    public static void main(String[] args) {
        String[][] clothes = {{"yellowhat", "headgear"},{"bluesunglasses", "eyewear"},{"green_turban", "headgear"}};

        int answer = 1;
        Map<String,Integer> map = new HashMap<>();
        for (String[] clothe : clothes){
            String type = clothe[1];
            map.put(type,map.getOrDefault(type,0)+1);
        }

        Iterator<Integer> it = map.values().iterator();

        while (it.hasNext()){
            answer *= it.next().intValue()+1;
        }

        System.out.print(answer-1);

    }
}
