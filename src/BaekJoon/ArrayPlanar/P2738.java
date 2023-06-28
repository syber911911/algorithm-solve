package BaekJoon.ArrayPlanar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[][] matrix = new int[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())];
        String line = "";
        int index = 0;

        while (!(line = br.readLine()).equals("")) {
            if(index >= matrix.length) index = 0;
            st = new StringTokenizer(line, " ");
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[index][i] += Integer.parseInt(st.nextToken());
            }
            index++;
        }
        for (int[] rows : matrix) {
            for (int row : rows) {
                System.out.printf("%d ", row);
            }
            System.out.println();
        }
    }
}