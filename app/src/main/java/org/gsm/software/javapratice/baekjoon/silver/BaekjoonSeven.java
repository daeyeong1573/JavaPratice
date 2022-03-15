package org.gsm.software.javapratice.baekjoon.silver;

import java.util.Scanner;

//최대공약수와 최소 공배수 2609번
public class BaekjoonSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp;
        if (a>b){
           temp = a;
           a = b;
           b = temp;
        }

        System.out.print(gcd(a,b)+"\n"+(a*b)/gcd(a,b));



    }

    public static int gcd(int a, int b){
        if ( b == 0 ) return a;
        return gcd(b,a%b);
    }


}
