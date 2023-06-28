package Codeup;

import java.util.Scanner;
public class Codeup1124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] line = sc.nextLine().replaceAll("[^0-9]", " ").trim().split(" ");
        System.out.print(Integer.parseInt(line[0]) * 12 + Integer.parseInt(line[1]));
    }
}
