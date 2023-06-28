package BaekJoon.IfElse;

import java.util.Scanner;

public class P1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int operand1 = sc.nextInt();
        int operand2 = sc.nextInt();

        if(operand1 > operand2) System.out.println(">");
        else if(operand1 < operand2) System.out.println("<");
        else System.out.println("==");
    }
}
