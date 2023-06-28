package Codeup;

import java.util.Scanner;

public class Codeup1120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int iVal1 = sc.nextInt();
        int iVal2 = sc.nextInt();
        int iVal3 = sc.nextInt();
        int total = iVal1 + iVal2 + iVal3;

        System.out.printf("%.2f\n", total / 3.0);
    }
}
