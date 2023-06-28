package Codeup;

import java.util.Scanner;

public class Codeup1088 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxValue = sc.nextInt();

        for(int i = 1; i <= maxValue; i++){
            if(i % 3 != 0) System.out.println(i);
        }
    }
}
