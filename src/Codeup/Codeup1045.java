package Codeup;

import java.util.Scanner;

public class Codeup1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int iValOne = sc.nextInt();
        int iValTwo = sc.nextInt();

        System.out.printf("%d\n" , iValOne + iValTwo);
        System.out.printf("%d\n" , iValOne - iValTwo);
        System.out.printf("%d\n" , iValOne * iValTwo);
        System.out.printf("%d\n" , iValOne / iValTwo);
        System.out.printf("%d\n" , iValOne % iValTwo);
        System.out.printf("%.2f\n" , (float)iValOne / iValTwo);
    }
}
