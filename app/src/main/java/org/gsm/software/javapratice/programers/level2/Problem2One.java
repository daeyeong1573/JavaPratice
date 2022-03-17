package org.gsm.software.javapratice.programers.level2;

//프로그래머스 Level 2 N개의 최소 공배수
public class Problem2One {
    public static void main(String[] args) {
        int[] arr ={1,2,4,6,14};
        System.out.print(solution(arr));
    }

    public static int solution(int[] arr) {
        int answer = arr[0];
        int min = 0;
        int max = 0;

        for(int i = 0 ; i < arr.length ; i++){
            min = Math.min(answer,arr[i]);
            max = Math.max(answer,arr[i]);
            answer = answer * arr[i] / gcd(min,max) ;
        }

        return answer;
    }

    public static int gcd(int min, int max){
        if(max == 0 ) return min;

        return gcd(max,min%max);
    }
}
