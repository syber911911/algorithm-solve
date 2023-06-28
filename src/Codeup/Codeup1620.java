package Codeup;

import java.util.Scanner;

public class Codeup1620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        while (true) {
            if(sumOfPosition(value) < 10) break;
            else value = sumOfPosition(value);
        }
        System.out.println(sumOfPosition(value));
    }

    public static int sumOfPosition(int n) {
        int answer = 0;
        while(n != 0) {
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }
}
