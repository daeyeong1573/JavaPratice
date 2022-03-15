package org.gsm.software.javapratice.baekjoon;

import java.util.*;


//백준 소수 2581번
public class BeakjoonTen {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int m = sc.nextInt();
        int n = sc.nextInt();
        List<Integer> temp = new ArrayList<Integer>();

        for (int i = m; i <= n;i++){
            if (prime(i)){
                temp.add(i);
                sum = sum +i;
            }
        }

        if (temp.size() == 0) {
            System.out.print(-1);
        } else {
            System.out.println(sum);
            System.out.println(temp.get(0));
        }

    }

    public static boolean prime(int n) {
        if (n < 2) return false; // 1은 소수도 합성수도 아니다!
        // n을 2부터 n-1까지의 수로 n-1(1과 자기자신 제외) 나눴을 때 나머지가 0이면 합성수
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        //위의 조건문을 모두 통과시 소수이기 때문에 true 리턴
        return true;
    }

}

