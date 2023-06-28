package Codeup;

import java.util.Scanner;

public class Codeup1118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int xLength = sc.nextInt();
        int yLength = sc.nextInt();

        System.out.printf("%.1f\n", (xLength * yLength) / 2.0);
    }
}
