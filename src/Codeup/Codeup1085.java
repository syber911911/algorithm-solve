package Codeup;

import java.util.Scanner;

public class Codeup1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hz = sc.nextInt();
        int bit = sc.nextInt();
        int channel = sc.nextInt();
        int sec = sc.nextInt();

        long totalBit = (long)hz * bit * channel * sec;
        float totalMb = totalBit / 8 / 1024 / 1024.0f;

        System.out.printf("%.1f MB\n", totalMb);
    }
}
