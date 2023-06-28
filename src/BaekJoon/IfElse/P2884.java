package BaekJoon.IfElse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] time = bf.readLine().split(" ");
        int hour = Integer.parseInt(time[0]);
        int minute = Integer.parseInt(time[1]);

        if(minute < 45) {
            hour--;
            minute = 60 - (45 - minute);
            if(hour < 0) hour = 23;
            System.out.printf("%d %d\n", hour, minute);
        } else {
            System.out.printf("%d %d\n", hour, minute - 45);
        }
    }
}
