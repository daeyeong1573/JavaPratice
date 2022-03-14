package org.gsm.software.javapratice.level1;

import java.lang.reflect.Array;
import java.util.Arrays;

//최대공약수 와 최소공배수 구하기
public class JavaOne {
    public static void main(String[] args) {
        System.out.print(Arrays.toString(solution(11,12)));
    }

    public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = gcd(n,m);
        //유클리드 호제법 사용
        answer[1] = (n*m)/answer[0];

        return answer;
    }

    //재귀함수
    public static int gcd(int a,int b){
        if (b == 0) return a;

        return gcd(b,a%b);
    }


}





