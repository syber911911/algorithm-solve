package Codeup;

import java.util.Scanner;

public class Codeup1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int[] personNumber = new int[count];

        for (int i = 0; i < personNumber.length; i++) {
            personNumber[i] = sc.nextInt();
        }

        for(int i = personNumber.length - 1; i >= 0; i--){
            System.out.printf("%d ", personNumber[i]);
        }
    }
}
