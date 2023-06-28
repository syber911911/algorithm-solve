package Codeup;

import java.util.Scanner;

public class Codeup1086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int w = sc.nextInt();
        int h = sc.nextInt();
        int b = sc.nextInt();

        int totalBit = w * h * b;
        float totalMb = totalBit / 8 / 1024 / 1024.0f;

        System.out.printf("%.2f MB\n", totalMb);
    }
}
