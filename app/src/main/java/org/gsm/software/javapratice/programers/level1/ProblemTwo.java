package org.gsm.software.javapratice.programers.level1;

import java.util.Arrays;

//프로그래머스 Level1 K번째 수 구하기
public class ProblemTwo {
    public static void main(String[] args) {
        int[][] commands = {{2, 5, 3},{4, 4, 1},{1, 7, 3}};
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        System.out.print(Arrays.toString(solution(array,commands)));

    }
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int cnt = 0;

        for(int i = 0; i < commands.length ; i++){
            int[] temp = new int[(commands[i][1]-commands[i][0])+1];

            //배열의 시작은 0번째 이므로 -1을 해줍니다.
            for(int j = commands[i][0]-1; j <= commands[i][1]-1; j++){
                temp[cnt] = array[j];
                cnt++;
            }

            //정렬
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];

            cnt = 0;
        }

        return answer;
    }
}
