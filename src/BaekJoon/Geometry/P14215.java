package BaekJoon.Geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P14215 {
    public static void main(String[] args) throws IOException {
        // maxSide < side1 + side2 + side3 - maxSide
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int side1 = Integer.parseInt(st.nextToken());
        int side2 = Integer.parseInt(st.nextToken());
        int side3 = Integer.parseInt(st.nextToken());
        int maxSide = Math.max(Math.max(side1, side2), side3);
        int otherSides = side1 + side2 + side3 - maxSide;

        if (maxSide < otherSides) System.out.println(otherSides + maxSide);
        else System.out.println(otherSides + otherSides - 1);
    }
}
