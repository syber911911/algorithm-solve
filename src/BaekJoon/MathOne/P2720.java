package BaekJoon.MathOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loopSize = Integer.parseInt(br.readLine());
        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        int penny = 1;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < loopSize; i++) {
            int money = Integer.parseInt(br.readLine());

            sb.append(money / quarter).append(" ");
            sb.append(money % quarter / dime).append(" ");
            sb.append(money % quarter % dime / nickel).append(" ");
            sb.append(money % quarter % dime % nickel / penny).append(" ").append("\n");
        }
        System.out.println(sb);
    }
}
