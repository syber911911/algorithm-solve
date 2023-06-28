package Codeup;

import java.util.Scanner;

public class Codeup1089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstTerm = sc.nextInt();
        int difference = sc.nextInt();
        int index = sc.nextInt();

        System.out.println(firstTerm + (index - 1) * difference);
    }
}
