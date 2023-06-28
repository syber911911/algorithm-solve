package Codeup;

import java.util.Scanner;

public class Codeup1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxValue = sc.nextInt();
        int result = 0;
        int nextOperand = 1;

        while(result < maxValue) {
            result += nextOperand;
            nextOperand++;
        }
        System.out.println(result);
    }
}
