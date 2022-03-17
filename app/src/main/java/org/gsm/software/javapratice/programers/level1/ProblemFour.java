package org.gsm.software.javapratice.programers.level1;

//프로그래머스 Level 1 정수 거꾸로 배열로 출력
public class ProblemFour {
    public static void main(String[] args) {
        System.out.print(solution(145678));
    }

    public static int[] solution(long n) {
        int length = (int)(Math.log10(n)+1) ;
        int[] answer = new int[length];
        int j = 0;

        while(n != 0){
            answer[j] = (int) (n % 10) ;
            n = n/10;
            j++;
        }

        return answer;
    }

}
