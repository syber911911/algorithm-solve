package Codeup;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Codeup1361 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        /*for (int i = 0; i < height; i++) {
            for(int j = 0; j < i; j++) System.out.print(" ");
            System.out.println("**");
        }*/
        for (int i = 0; i < height; i++){
            for(int j = 0; j < i; j++) bw.append(" ");
            bw.append("**\n");
        }
        bw.flush();
        bw.close();
    }
}
