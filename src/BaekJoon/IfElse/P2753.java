package BaekJoon.IfElse;

import java.util.Scanner;

public class P2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x * y > 0) System.out.println(x > 0 ? "1" : "3");
        else System.out.println(x > 0 ? "4" : "2");
    }
}
