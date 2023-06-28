package Codeup;

import java.util.Scanner;

public class Codeup1068 {
    public static void main(String[] args) {
        // 90 ~ 100 : A
        // 70 ~ 89 : B
        // 40 ~ 69 : C
        //  0 ~ 39 : D
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();

        if (score <= 100 && score >= 90) {
            System.out.println("A");
        } else if (score >= 70) {
            System.out.println("B");
        } else if (score >= 40) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}
