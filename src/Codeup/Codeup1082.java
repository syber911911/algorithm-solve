package Codeup;

import java.util.Scanner;

public class Codeup1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputVal = sc.nextInt(16);

        for(int i = 1; i <= Integer.parseInt("F", 16); i++){
            System.out.printf("%X*%X=%X\n", inputVal, i, inputVal * i);
        }
    }
}
