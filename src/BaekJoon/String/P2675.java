package BaekJoon.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int repeatNum = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < repeatNum; i++) {
            String[] inputStr = bf.readLine().split(" ");
            for (byte alpha : inputStr[1].getBytes()) {
                for (int k = 0; k < Integer.parseInt(inputStr[0]); k++) {
                    sb.append((char)alpha);
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
