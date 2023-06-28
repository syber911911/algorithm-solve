package Codeup;

import java.util.Scanner;

public class Codeup1671 {
    public String RockPaperScissors(int user, int computer) {
        //바위 = 0, 가위 = 1, 보 = 2
        int flag = user - computer;
        switch (flag) {
            case 0: return "tie";
            case -1, 2: return "win";
            case 1, -2: return "lose";
            default: return "Error";
        }
    }
    public static void main(String[] args) {
        Codeup1671 codeup = new Codeup1671();
        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();
        int computer = sc.nextInt();

        System.out.println(codeup.RockPaperScissors(user, computer));
    }
}
