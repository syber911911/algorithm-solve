package BaekJoon.ArrayPlanar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int max = 0;
        int rowIndex = 0;
        int columnIndex = 0;

        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                int temp = Integer.parseInt(st.nextToken());
                if(temp > max) {
                    max = temp;
                    rowIndex = i;
                    columnIndex = j;
                }
            }
        }
        System.out.printf("%d\n%d %d\n", max, rowIndex + 1, columnIndex + 1);
    }
}
