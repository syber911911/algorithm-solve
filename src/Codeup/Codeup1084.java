package Codeup;

import java.io.*;
import java.util.Scanner;

public class Codeup1084 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int red = sc.nextInt();
        int green = sc.nextInt();
        int blue = sc.nextInt();
        int count = red * green * blue;

        for (int i = 0; i < red; i++) {
            for (int j = 0; j < green; j++) {
                for (int k = 0; k < blue; k++) {
                    bw.write(i + " " + j + " " + k + "\n");
                }
            }
        }
        bw.flush();
        System.out.printf("%d\n", count);
    }
}
