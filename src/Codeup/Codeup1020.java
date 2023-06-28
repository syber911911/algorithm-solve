package Codeup;

import java.util.Scanner;

public class Codeup1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strList = sc.nextLine().split("-");
        System.out.println(strList[0] + strList[1]);
    }
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String frontStr = str.substring(0, 6);
        String backStr = str.substring(7);
        System.out.println(frontStr + backStr);
    }*/
}
