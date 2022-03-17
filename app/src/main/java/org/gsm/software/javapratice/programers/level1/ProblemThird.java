package org.gsm.software.javapratice.programers.level1;

import java.util.ArrayList;
import java.util.List;

//Level1 같은 숫자는 싫어
public class ProblemThird {
    public static void main(String[] args) {
        int[] num = {1,1,3,3,0,1,1};
    }
    public static int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        int cnt = 0;

        for(int i = 0 ; i < arr.length ; i++){

            if( i == 0 || arr[i] != arr[i-1]){
                list.add(arr[i]);
            }else if(arr[i] == arr[i-1]){
                continue;
            }
        }
        int[] answer = new int[list.size()];

        for(int i = 0 ; i < list.size() ; i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}
