package Codeup;

import java.util.Scanner;

public class Codeup1075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = sc.nextInt() - 1; i >= 0; i++) {
            //for문의 조건식과 증감식은 별개로 동작하기에 --i와 i++의 동작에는 차이가 없다
            System.out.println(i);
        }
    }
}
