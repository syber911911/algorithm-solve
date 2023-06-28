package Codeup;

import java.util.Scanner;

public class Codeup1274 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputVal = sc.nextInt();
        int factors = 0;

        for (int i = 2; i < inputVal; i++) {
            if(inputVal % i == 0){
                factors++;
            }
        }
        System.out.println(factors == 0 ? "prime" : "not prime");
    }
}
