package Codeup;

import java.util.Scanner;

public class Codeup1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArr = sc.nextLine().split(":");

        System.out.printf("%d", Integer.parseInt(strArr[1]));
    }
}
