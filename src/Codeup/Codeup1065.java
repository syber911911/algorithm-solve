package Codeup;

import java.util.Scanner;

public class Codeup1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int iVal1 = sc.nextInt();
        int iVal2 = sc.nextInt();
        int iVal3 = sc.nextInt();

        if (iVal1 % 2 == 0) System.out.printf("%d\n", iVal1);
        if (iVal2 % 2 == 0) System.out.printf("%d\n", iVal2);
        if (iVal3 % 2 == 0) System.out.printf("%d\n", iVal3);
    }
}
