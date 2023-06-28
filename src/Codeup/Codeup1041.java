package Codeup;

import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup1041 {
    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        System.out.printf("%c", is.read() + 1);
    }
}
