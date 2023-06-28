package Codeup;

import java.util.Scanner;

public class Codeup1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int[] personNumber = new int[23];
        for (int i = 0; i < count; i++) {
            personNumber[sc.nextInt() - 1]++;
        }
        for(int i = 0; i < personNumber.length; i++){
            if(personNumber[i] != 0) {
                System.out.printf("%d ", i + 1);
                break;
            }
        }
    }
}
