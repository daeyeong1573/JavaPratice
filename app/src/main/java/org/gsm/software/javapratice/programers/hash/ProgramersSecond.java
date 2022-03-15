package org.gsm.software.javapratice.programers.hash;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//프로그래머스 고득점 Kit [해시] 전화번호 목록
public class ProgramersSecond {
    public static void main(String[] args) {
        String[] phoneNum = {"119", "97674223", "1195524421"};
        System.out.print(solutionLoop(phoneNum));
    }


    //반복문을 사용한 방법
    public static boolean solutionLoop(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length - 1; i++) {
            //startsWith으로 접두사 체크
            if (phone_book[i + 1].startsWith(phone_book[i])) answer = false;
        }
        return answer;
    }

    //다른사람의 HashMap을 사용한 방법
    public boolean solution(String[] phoneBook) { // 1. HashMap을 선언한다
        Map<String, Integer> map = new HashMap<>();
        // 2. 모든 전화번호를 HashMap에 넣는다.
        for (int i = 0; i < phoneBook.length; i++) map.put(phoneBook[i], i);
        // 3. 모든 전화번호의 substring이 HashMap에 존재하는지 확인한다.
        for (int i = 0; i < phoneBook.length; i++)
            for (int j = 0; j < phoneBook[i].length(); j++)
                if (map.containsKey(phoneBook[i].substring(0, j)))
                    return false;
        return true;
    }

}
