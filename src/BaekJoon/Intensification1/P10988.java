package BaekJoon.Intensification1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        StringBuilder sb = new StringBuilder(inputStr);
        String reverseStr = sb.reverse().toString();
        System.out.println(inputStr.equals(reverseStr) ? 1 : 0);
    }
}
