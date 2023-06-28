package BaekJoon.Geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P5073 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        StringTokenizer st;

        while (!line.equals("0 0 0")) {
            st = new StringTokenizer(line);
            int side1 = Integer.parseInt(st.nextToken());
            int side2 = Integer.parseInt(st.nextToken());
            int side3 = Integer.parseInt(st.nextToken());
            int maxSide = Math.max(Math.max(side1, side2), side3);

            if (maxSide < side1 + side2 + side3 - maxSide) {
                if (side1 == side2 && side2 == side3) System.out.println("Equilateral");
                else if (side1 != side2 && side2 != side3 && side3 != side1) System.out.println("Scalene");
                else System.out.println("Isosceles");
            } else System.out.println("Invalid");
            line = br.readLine();
        }
    }
}
