package Codeup;

import java.util.Scanner;

public class Codeup1069 {
    public static void main(String[] args) {
        //A : best!!!
        //B : good!!
        //C : run!
        //D : slowly~
        //나머지 문자들 : what?
        Scanner sc = new Scanner(System.in);

        String grade = sc.nextLine();

        switch (grade) {
            case "A":
                System.out.println("best!!!");
                break;
            case "B":
                System.out.println("good!!");
                break;
            case "C":
                System.out.println("run!");
                break;
            case "D":
                System.out.println("slowly~");
                break;
            default:
                System.out.println("what?");
        }
    }
}
