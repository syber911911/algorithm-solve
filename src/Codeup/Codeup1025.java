package Codeup;

import java.util.Scanner;

public class Codeup1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal = sc.nextInt();
        for(int i = 10000; i > 0; i /= 10){
            System.out.printf("[%d]\n", (iVal / i) * i);
            iVal = iVal % i;
        }
    }
}
