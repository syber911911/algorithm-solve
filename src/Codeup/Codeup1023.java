package Codeup;

import java.util.Scanner;

public class Codeup1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputStr = sc.nextLine().split("\\.");
        System.out.printf("%s\n%s", inputStr[0], inputStr[1]);
    }
}
