package BaekJoon.Loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputByte = Integer.parseInt(br.readLine());
        System.out.println("long ".repeat(inputByte / 4) + "int");
    }
}
