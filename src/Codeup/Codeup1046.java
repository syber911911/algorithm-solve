package Codeup;

import java.util.Scanner;

public class Codeup1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int iValOne = sc.nextInt();
        int iValTwo = sc.nextInt();
        int iValThree = sc.nextInt();
        int total = iValOne + iValTwo + iValThree;
        float average = total / 3.0f;

        System.out.printf("%d\n", total);
        System.out.printf("%.1f", average);
    }
}
