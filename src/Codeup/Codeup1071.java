package Codeup;

import java.util.Scanner;

public class Codeup1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal = sc.nextInt();
        for(int i = 0; iVal != 0; i++){
            System.out.println(iVal);
            iVal = sc.nextInt();
        }
    }
}
