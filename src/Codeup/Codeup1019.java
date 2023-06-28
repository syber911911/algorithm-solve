package Codeup;

import java.util.Scanner;

public class Codeup1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strList = sc.nextLine().split("\\.");

        int year = Integer.parseInt(strList[0]);
        int month = Integer.parseInt(strList[1]);
        int day = Integer.parseInt(strList[2]);

        System.out.printf("%04d.%02d.%02d", year, month, day);

        /*StringTokenizer st = new StringTokenizer(sc.next(), ".");
        int year = Integer.parseInt(st.nextToken());
        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());

        System.out.printf("%04d.%02d.%02d", year, month, day);*/
    }
}
