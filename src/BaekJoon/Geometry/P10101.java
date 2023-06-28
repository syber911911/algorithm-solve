package BaekJoon.Geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10101 {
    public static void main(String[] args) throws IOException {
        // 세각의 크기가 모두 60 --> Equilateral
        // 세각의 합이 180이고, 두 각이 같은 경우에는 Isosceles
        // 세각의 합이 180이고, 같은 각이 없는 경우 Scalene
        // 세각의 합이 180이 아닌경우 Error
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int angle1 = Integer.parseInt(br.readLine());
        int angle2 = Integer.parseInt(br.readLine());
        int angle3 = Integer.parseInt(br.readLine());

        if (angle1 + angle2 + angle3 != 180) System.out.println("Error");
        else {
            if (angle1 == angle2 && angle2 == angle3) System.out.println("Equilateral");
            else if (angle1 == angle2 || angle2 == angle3 || angle3 == angle1) System.out.println("Isosceles");
            else System.out.println("Scalene");
        }
    }
}
