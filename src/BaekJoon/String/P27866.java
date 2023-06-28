package BaekJoon.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = bf.readLine();
        int index = Integer.parseInt(bf.readLine());
        System.out.println(String.valueOf(inputStr.charAt(index - 1)));
    }
}
