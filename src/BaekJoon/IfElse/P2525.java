package BaekJoon.IfElse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] time = bf.readLine().split(" ");
        int hour = Integer.parseInt(time[0]);
        int minute = Integer.parseInt(time[1]) + Integer.parseInt(bf.readLine());

        if(minute > 59) {
            hour += minute / 60;
            minute = minute % 60;
            if(hour > 23) hour -= 24;
            System.out.printf("%d %d\n", hour, minute);
        } else {
            System.out.printf("%d %d\n", hour, minute);
        }
    }
}
