package Codeup;

import java.util.Scanner;

public class Codeup1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strVal = sc.nextLine();
        int hexVal = Integer.parseInt(strVal, 16);
        System.out.printf("%o", hexVal);
    }
}
