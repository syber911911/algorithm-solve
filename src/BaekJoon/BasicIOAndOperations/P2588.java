package BaekJoon.BasicIOAndOperations;

import java.util.Scanner;

public class P2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int operand1 = sc.nextInt();
        int operand2 = sc.nextInt();
        int answer = 0;

        System.out.println(operand1 * (operand2 % 10));
        System.out.println(operand1 * (operand2 / 10 % 10));
        System.out.println(operand1 * (operand2 / 100 % 10));
        System.out.println(operand1 * operand2);

        /*for (int i = 1; i < 101; i *= 10) {
            int temp = operand1 * (operand2 % 10);
            operand2 /= 10;
            answer += temp * i;
            System.out.println(temp);
        }
        System.out.println(answer);*/
    }
}
