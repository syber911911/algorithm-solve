package Codeup;

import java.util.Scanner;

public class Codeup1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loopSize = sc.nextInt();
        int iVal = 0;

        for(int i = 0; i < loopSize; i++){
            iVal = sc.nextInt();
            System.out.println(iVal);
        }
    }
}
