package Codeup;

import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup1076 {
    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        int inputChar = is.read();
        for(int i = 'a'; i <= inputChar; i++) {
            System.out.printf("%c ", i);
        }
    }
}
