package org.gsm.software.javapratice.programers.level1;

//프로그래머스 Level 1 정수의 제곱근
public class ProblemOne {
    public static void main(String[] args) {
        System.out.print(solution(3));
    }

    public static long solution(long n) {
        double temp = Math.sqrt(n);

        if (temp%1 == 0) return (long) ((temp+1)*(temp+1));

        return -1;
    }
}
