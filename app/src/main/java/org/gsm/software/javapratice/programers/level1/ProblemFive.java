package org.gsm.software.javapratice.programers.level1;

//프로그래머스 Level1 음양 더하기
public class ProblemFive {
    public static void main(String[] args) {
        int[] absolutes = {4,7,12};
        boolean[] signs = {true,false,true};
        System.out.print(solution(absolutes,signs));
    }

    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i = 0 ; i < signs.length ; i++){
            if(signs[i]){
                answer += absolutes[i];
            }else{
                answer += absolutes[i]*-1;
            }
        }

        return answer;
    }

}
