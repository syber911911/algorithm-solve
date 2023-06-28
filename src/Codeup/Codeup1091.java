package Codeup;

import java.util.Scanner;

public class Codeup1091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long firstTerm = sc.nextLong();
        int diffMulti = sc.nextInt();
        int diffPlus = sc.nextInt();
        int index = sc.nextInt();

        for(int i = 1; i < index; i++){
            firstTerm = firstTerm * diffMulti + diffPlus;
        }
        System.out.println(firstTerm);
    }
}
