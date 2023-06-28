package BaekJoon.ArrayPlanar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] matrix = new char[5][15];

        for (int i = 0; i < 5; i++) {
            String inputStr = br.readLine();
            for (int j = 0; j < inputStr.length(); j++) {
                matrix[i][j] = inputStr.charAt(j);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (matrix[j][i] == '\0') continue;
                sb.append(matrix[j][i]);
            }
        }
        System.out.println(sb);
    }
}
