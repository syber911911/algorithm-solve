package Codeup;

import java.util.Scanner;

public class Codeup1092 {
    public static void main(String[] args) {
        // 최소 공배수 = 두 수의 곱 / 최대 공약수
        // 세 수의 최소 공배수 = 두 수의 최소 공배수와 다른 한 수와의 최소 공배수

        Scanner sc = new Scanner(System.in);
        int iVal1 = sc.nextInt();
        int iVal2 = sc.nextInt();
        int iVal3 = sc.nextInt();

        int iVal1NiVal2 = (iVal1 * iVal2) / gcd(iVal1, iVal2); // iVal1과 iVal2의 최소 공배수
        int result = (iVal1NiVal2 * iVal3) / gcd(iVal1NiVal2, iVal3); // 세 수의 최소 공배수

        System.out.println(result);
    }
    public static int gcd(int a, int b) { //재귀 함수는 메모리 사용량이 많아질 수 있기에 반복문으로 처리도 고려
        if (b == 0) return a;
        else return gcd(b, a % b);
    }
}
