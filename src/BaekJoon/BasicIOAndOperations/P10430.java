package BaekJoon.BasicIOAndOperations;

import java.util.Scanner;

public class P10430 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int operand1 = sc.nextInt();
        int operand2 = sc.nextInt();
        int operand3 = sc.nextInt();

        System.out.println((operand1 + operand2) % operand3);
        System.out.println(((operand1 % operand3) + (operand2 % operand3)) % operand3);
        System.out.println((operand1 * operand2) % operand3);
        System.out.println(((operand1 % operand3) * (operand2 % operand3)) % operand3);
    }
}
