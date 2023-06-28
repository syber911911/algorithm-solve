package BaekJoon.BasicIOAndOperations;

import java.io.IOException;
import java.util.Scanner;

public class P10869 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int operand1 = sc.nextInt();
        int operand2 = sc.nextInt();

        System.out.println(operand1 + operand2);
        System.out.println(operand1 - operand2);
        System.out.println(operand1 * operand2);
        System.out.println(operand1 / operand2);
        System.out.println(operand1 % operand2);
    }
}
