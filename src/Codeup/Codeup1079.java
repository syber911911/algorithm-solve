package Codeup;

import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup1079 {
    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        while(true) {
            int inputChar = is.read();
            if(inputChar != ' '){
                System.out.println((char)inputChar);
            }
            if(inputChar == 'q') break;
        }
    }
}
