package Codeup;

import java.util.Scanner;

public class Codeup1122 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int second = sc.nextInt();

        System.out.printf("%d %d\n", second / 60, second % 60);
    }
}
