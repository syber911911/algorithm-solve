package BaekJoon.Loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = "";

        while((inputStr = br.readLine()) != null) {
            int operand1 = inputStr.charAt(0) - '0';
            int operand2 = inputStr.charAt(2) - '0';
            System.out.println(operand1 + operand2);
        }
    }
}
