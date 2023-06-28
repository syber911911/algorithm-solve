package Codeup;

import java.util.Scanner;

public class Codeup1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputVal = sc.nextInt();
        int total = 0;
        for(int i = 1; i <= inputVal; i++) {
            if(i % 2 == 0) total += i;
        }
        System.out.println(total);
    }
}
