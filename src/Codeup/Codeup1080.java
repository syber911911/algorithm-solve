package Codeup;

import java.util.Scanner;

public class Codeup1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intputVal = sc.nextInt();
        int sum = 0;
        int count = 0;

        for(int i = 1; sum < intputVal; i++) {
            sum += i;
            count = i;
        }
        System.out.println(count);
    }
}
