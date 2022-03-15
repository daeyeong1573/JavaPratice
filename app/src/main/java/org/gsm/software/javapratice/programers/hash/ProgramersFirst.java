package org.gsm.software.javapratice.programers.hash;

import java.util.Arrays;
import java.util.HashMap;

//프로그래머스 고득점 Kit 완주하지 못 한 선수
public class ProgramersFirst {
    public static void main(String[] args) {
        String[] p = {"leo", "kiki", "eden" };
        String[] c = {"eden", "kiki"};
        System.out.println(solution(p,c));

    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String,Integer> hm = new HashMap<>();
        for (String player : participant){
            hm.put(player,hm.getOrDefault(player,0)+1);
        }
        for (String player : completion){
            hm.put(player,hm.get(player)-1);
        }

        for (String key : hm.keySet()){
            if (hm.get(key) != 0){
                answer = key;
                break;
            }
        }
        return answer;
    }
}

