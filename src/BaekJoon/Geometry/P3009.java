package BaekJoon.Geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] point1 = br.readLine().split(" "); // 5 5
        String[] point2 = br.readLine().split(" "); // 5 7
        String[] point3 = br.readLine().split(" "); // 7 5
        String x;
        String y;

        if (point1[0].equals(point2[0])) {
            x = point3[0];
        } else if (point1[0].equals(point3[0])) {
            x = point2[0];
        } else {
            x = point1[0];
        }

        if (point1[1].equals(point2[1])) {
            y = point3[1];
        } else if (point1[1].equals(point3[1])) {
            y = point2[1];
        } else {
            y = point1[1];
        }

        System.out.printf("%s %s", x, y);
    }
}
