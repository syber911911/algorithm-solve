package Codeup;

import java.util.Scanner;

public class Codeup1056 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int iVal1 = sc.nextInt();
        int iVal2 = sc.nextInt();
        boolean result = iVal1 != iVal2;

        System.out.println(result ? 1 : 0);
    }
}
