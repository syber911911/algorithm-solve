package Codeup;

import java.util.Scanner;

public class Codeup1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strList = sc.nextLine().split(":");
        System.out.printf("%s:%s", strList[0], strList[1]);
    }
}
