package BaekJoon.Geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P9063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int maxX = Integer.MIN_VALUE;
        int minX = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;
        StringTokenizer st;

        if (num == 1) System.out.println(0);
        else {
            for (int i = 0; i < num; i++) {
                st = new StringTokenizer(br.readLine());
                int inputX = Integer.parseInt(st.nextToken());
                int inputY = Integer.parseInt(st.nextToken());

                maxX = Math.max(inputX, maxX);
                minX = Math.min(inputX, minX);

                maxY = Math.max(inputY, maxY);
                minY = Math.min(inputY, minY);
            }
            System.out.println((maxX - minX) * (maxY - minY));
        }

    }
}
